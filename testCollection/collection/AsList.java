package cn.ttw.testCollection.collection;


import java.util.ArrayList;

/**
 * Arrays工具类中的asList方法的使用
 *	数组转换为集合虽然不能增加或减少元素，但是可以用集合的思想操作数组，既可以使用集合中的其他方法
 */


import java.util.Arrays;
import java.util.List;

public class AsList {

	public static void main(String[] args) {
		//test1();
		//test2();
		//test3();
		
		
	}

	public static void test3() {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		String[] s = list.toArray(new String[1]);	//当集合转换为数组时，当数组长度<=集合的size时，转换后的数组长度等于集合的size
													//当数组长度<=集合的size,分配的数组长度和制定的长度一样
		for (String string : s) {
			System.out.println(string);
		}
	}

	public static void test2() {
		//		int[] a = {11,22,33,44,55};
		//		List list = Arrays.asList(a);	//基本数据类型的数组转换为集合，会将整个数组当作一个对象
		//		System.out.println(list);
				
				Integer[] arr = {11,22,33,44,55};
				List<Integer> list = Arrays.asList(arr);	//将数组转换为集合，数组必须是引用数据类型
				System.out.println(list);
	}

	public static void test1() {
		String[] s = {"a","b","c"};
		List<String> list = Arrays.asList(s);		//数组转换为集合
		//list.add("d");
		System.out.println(list);
	}
}
