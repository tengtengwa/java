package cn.ttw.testCollection.testSet;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * 在集合中储存了无序并且重复的字符串，定义一个方法，让其有序（字典顺序），而且不能去除重复
 *
 */


public class Test4 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("666");
		list.add("hahaha");
		list.add("lalala");
		list.add("wulawula");
		list.add("guajiguaji");
		list.add("honglingjin");
		list.add("aaa");
		list.add("666");
		
		sort(list);
		
		System.out.println(list);
		
	}
	
	//步骤：
	//新建一个TreeSet集合对象，因为对String本身就有比较排序功能，但不会保留重复，所以用比较器
	//将list集合中所有元素添加到TreeSet集合中，对其排序并保留重复
	//清空list集合
	//将TreeSet集合中的排好序的所有元素添加到list集合中
	public static void sort(ArrayList<String> list) {
		TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {		//匿名内部类

			@Override
			public int compare(String s1, String s2) {
				int num = s1.compareTo(s2);				//比较内容为主要条件
				return num == 0 ? 1 : num;				//返回非零数以保留重复
			}
			
		});
		ts.addAll(list);
		list.clear();
		list.addAll(ts);
		
		
		
		
	}
}





