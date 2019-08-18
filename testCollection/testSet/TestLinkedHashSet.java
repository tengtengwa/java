package cn.ttw.testCollection.testSet;

/**
 * LinkedHashSet底层是链表实现的，是set集合中唯一一个能保证存取顺序的集合对象
 * 是HashSet的子类，也保证元素唯一，与HashSet原理一样
 */

import java.util.LinkedHashSet;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("a");
		lhs.add("b");
		lhs.add("c");
		lhs.add("d");
		lhs.add("a");
		lhs.add("b");
		lhs.add("c");
		lhs.add("d");
		System.out.println(lhs);
		
		
		
	}
}
