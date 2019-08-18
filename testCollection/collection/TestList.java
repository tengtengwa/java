package cn.ttw.testCollection.collection;

import java.util.*;

/**
 * 测试Collection接口中的方法
 * @author 腾腾娃发光的板砖
 *
 */

public class TestList {
	private static final String E = null;

	public static void main(String[] args) {
		Collection<String> c = new ArrayList<>();
		
//		Test1(c);
//		test2();
//		test3();
//		test4();
//		test5();
		
		
}

	
	
	private static void test5() {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("world");
		list.add("c");
		list.add("d");
		
		ListIterator lit = list.listIterator();
		while(lit.hasNext()) {
			String str = (String) lit.next();
			if("world".equals(str)) {
				//list.add("javaee");
				lit.add("javaee");
			}
		}
		System.out.println(list);
	}

	private static void test4() {
		List<String> list = new ArrayList<>();
		list.add("666");
		list.add("88");
		list.add("66");
		list.add("88");
		list.add("68");
		list.set(4,"hahaha");
		
		//通过索引遍历List集合
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

private static void test1(Collection<String> c) {
		System.out.println(c.isEmpty());
		
		c.add("ttw");
		c.add("666");
		System.out.println(c);
		
		System.out.println(c.contains("666"));
		
		c.remove("666");
		System.out.println(c);
		c.clear();
		System.out.println(c);
	}
	
private static void test2(){
	
	List<String> list1 = new ArrayList<String>();
	list1.add("66");
	list1.add("88");
	list1.add("68");
	System.out.println("list1:"+list1);
	
	List<String> list2 = new ArrayList<String>();
	list2.add("686");
	list2.add("66");
	list2.add("666");
	System.out.println("list2:"+list2);
	
	list1.addAll(list2);
	System.out.println("list1.addAll(list2): "+list1);
	
	list1.removeAll(list2);		//去除交集
	System.out.println("list1.removeAll(list2): "+list1);
}	
	
	private static void test3() {
		List<String> list = new ArrayList<String>();
		list.add("ttw");
		list.add("666");
		list.add("hahaha");
		list.add("lalala");
		list.add("666");
		System.out.println(list);
		list.add(2, "888");
		System.out.println(list);
		list.set(2, "868");
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.indexOf("666"));
		System.out.println(list.lastIndexOf("666"));
	}
	





}













