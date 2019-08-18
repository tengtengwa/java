package cn.ttw.testCollection.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestIterator {

	public static void main(String[] args) {
		testIterator();
		testIteratorMap();
		testIteratorSet();
		testIteratorCollection();
	}

	private static void testIteratorCollection() {
		Collection<String> c = new ArrayList<>();
		c.add("666");
		c.add("lalala");
		c.add("hahaha");
		Iterator<String> it = c.iterator();
		while(it.hasNext()) {
			
			
			System.out.println(it.next());
		}
	}
	
	public static void testIterator() {
		List<String> list = new ArrayList<>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		
		for(Iterator<String> iter = list.iterator(); iter.hasNext();) {
			String tem = iter.next();
			System.out.println(tem);
		}
	}
	
	public static void testIteratorSet() {
		Set<String> set = new HashSet<>();
		set.add("aa");
		set.add("bb");
		set.add("cc");
		
		for(Iterator<String> iter = set.iterator(); iter.hasNext();) {
			String tem = iter.next();
			System.out.println(tem);
		}
	}
	
	public static void testIteratorMap() {
		Map<Integer,String> map1 = new HashMap<>();
		map1.put(100,"aa");
		map1.put(200,"bb");
		map1.put(300,"cc");
		
		Set<Entry<Integer,String>> ss = map1.entrySet();
		for(Iterator<Entry<Integer,String>> iter=ss.iterator(); iter.hasNext();) {
			Entry<Integer,String> tem = iter.next();
			
			System.out.println(tem.getKey()+"---"+tem.getValue());
		}
	}
	
	
}
