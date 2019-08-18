package cn.ttw.testCollection.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * Collections辅助类的测试
 *
 */

public class TestCollections {
	public static void main(String[] args) {
		//test1();
		test2();
		
		
	}

	public static void test2() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("c");
		list.add("6");
		list.add("a");
		list.add("d");
		list.add("b");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		System.out.println(Collections.binarySearch(list, "c"));
		System.out.println(Collections.max(list));
	}

	public static void test1() {
		List<String> list = new ArrayList<>();
		for(int i=0;i<10;i++) {
			list.add("ttw"+i);
		}
		System.out.println(list);
		
		Collections.shuffle(list);		//随机排列list中的元素
		System.out.println(list);
		
		Collections.reverse(list);		//逆序排列
		System.out.println(list);
		
		Collections.sort(list);			//递增的方式排序(通过Comparable接口)
		System.out.println(list);
		
		System.out.println(Collections.binarySearch(list, "ttw6"));		//折半查找
	}
}
