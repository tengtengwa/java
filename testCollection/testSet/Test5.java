package cn.ttw.testCollection.testSet;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * 从键盘接受一个字符串，对所有字符进行排序(不去重)，如：helloitcast -> acehillostt
 * 
 */

/**
 * 分析：
 * 1.新建Scanner对象，录入字符串
 * 2.将字符串转换为字符数组
 * 3.定义TreeSet集合，传入比较器对字符排序并保留重复
 * 4.遍历字符数组，将每一个字符储存在TreeSet集合中
 * 5.遍历TreeSet集合，打印每一个字符
 */

public class Test5 {

	private static Scanner sc;

	public static void main(String[] args) {
		//1.
		sc = new Scanner(System.in);
		System.out.println("输入一个字符串:");
		String s = sc.nextLine();
		//2.
		char[] arr = s.toCharArray();
		//3.
		TreeSet<Character> ts = new TreeSet<>(new Comparator<Character>() {		//注意：泛型类型为包装类，不能为基本数据类型

			@Override
			public int compare(Character c1, Character c2) {
				//int num = c1 - c2;					//自动拆箱
				int num = c1.compareTo(c2);
				return num == 0 ? 1 : num;
			}
			
		});
		
		//4.
		for (Character c : arr) {
			ts.add(c);				//自动装箱
		}
		
		for (Character cc : ts) {
			System.out.print(cc);	
		}
		
			
	}	
}

