package cn.ttw.testCollection.testMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Map没有Iterator方法
 * 
 * 
 */

public class TestHashMap {

	public static void main(String[] args) {
		//Test1();
		//test2();
		
		HashMap<Student,String> hm = new HashMap<Student, String>();
		hm.put(new Student("zs",23), "beijing");
		hm.put(new Student("ls",24), "shenzhen");
		hm.put(new Student("ww",25), "guangzhou");
		hm.put(new Student("zs",23), "shanghai");
		
		System.out.println(hm);
	}

	public static void test2() {
		Map<String,Integer> map = new HashMap<>();
		map.put("装三", 23);
		map.put("李四", 23);
		map.put("王五", 23);
		map.put("赵六", 23);
		
		/*Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String key = it.next();
			Integer value = map.get(key);
			System.out.println(key+"--"+value);
		}*/
		
		
		for (String key : map.keySet()) {
			System.out.println(key+"--"+map.get(key));
		}
	}

	public static void test1() {
		Map<String,Integer> map = new HashMap<>();
		map.put("装三", 23);
		map.put("李四", 23);
		map.put("王五", 23);
		map.put("赵六", 23);
		
		Collection<Integer> c = map.values();
		System.out.println(c);
		System.out.println(map.size());
	}
}
