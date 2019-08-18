package cn.ttw.testCollection.testMap;

import java.util.HashMap;

/**
 * HashMap嵌套HashMap
 * 
 * 
 */

public class HashMapHashMap {
	public static void main(String[] args) {
		
		HashMap<Student, String> hm1 = new HashMap<Student, String>();
		hm1.put(new Student("zs",23), "beijing");
		hm1.put(new Student("ls",24), "beijing");
		hm1.put(new Student("ww",25), "beijing");
		hm1.put(new Student("zl",26), "beijing");
		
		HashMap<Student, String> hm2 = new HashMap<Student, String>();
		hm2.put(new Student("ts",1023), "beijing");
		hm2.put(new Student("wk",1024), "beijing");
		hm2.put(new Student("bj",1025), "beijing");
		hm2.put(new Student("wj",1026), "beijing");
		
		HashMap<HashMap<Student, String>, String> hm = new HashMap<>();		//HashMap的嵌套
		hm.put(hm1, "1班");
		hm.put(hm2, "2班");
		
		for(HashMap<Student, String> h : hm.keySet()) {
			String value = hm.get(h);
			//遍历键的双列集合对象
			for(Student key : h.keySet()) {
				String value2 = h.get(key);
				
				System.out.println(key + "=" + value2 + "=" + value);
			}
			
		}
		
		
		
		
		
		
	}
}
