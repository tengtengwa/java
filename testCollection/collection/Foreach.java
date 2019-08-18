package cn.ttw.testCollection.collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 * 测试增强for循环
 *
 */

public class Foreach {

	public static void main(String[] args) {
		
		//Test1();
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("d");
		
		
		//1.普通for循环删除，索引要--
		for(int i=0;i<list.size();i++) {
			if("b".equals(list.get(i))) {
				list.remove(i--);
			}
		}
		System.out.println(list);
		
		
		//2.迭代器删除：用迭代器提供的remove方法
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			if("b".equals(it.next())) {
				//list.remove("b");				//不能用集合的删除方法，因为迭代过程中会出现并发修改异常
				it.remove();
			}
		}
		System.out.println(list);
		
		for(Iterator<String> it2 = list.iterator(); it2.hasNext();) {
			if("b".equals(it2.next())) {
				it2.remove();
			}
		}
		System.out.println(list);
		
		//3.增强for循环不能删除，只能遍历
		for (String string : list) {
			if("b".equals(string)) {
				list.remove("b");
			}
		}
		System.out.println(list);
		
		
	}

	public static void test1() {
		int[] arr = {11,2,5,6,98,34};
		for(int i:arr) {						//for循环底层依赖的是迭代器
			System.out.println(i);
		}
		
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("v");
		for (String string : list) {
			System.out.println(string);
		}
	}
}
