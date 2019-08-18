package cn.ttw.testCollection.testMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class TestMapEntry {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("装三", 23);
		map.put("李四", 23);
		map.put("王五", 23);
		map.put("赵六", 23);
		
		//Map.Entry说明Entry是Map的内部接口，将键和值封装成了Entry对象，并储存在Set集合中
		Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String,Integer>> it = entrySet.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry);
		}
		
		
	}
}
