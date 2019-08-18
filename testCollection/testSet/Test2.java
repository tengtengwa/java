package cn.ttw.testCollection.testSet;

import java.util.HashSet;
import java.util.Scanner;

/**
 * 用Scanner从键盘读取一行输入，去掉其中重复的字符，打印出不同的字符
 * aaaabbbcccddd
 *
 */

public class Test2 {

	public static void main(String[] args) {
		//1.创建Scanner对象
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一行字符串:");
		//2.创建HashSet对象
		HashSet<Character> hs = new HashSet<>();
		//3.字符串转换为字符数组，将每个字符储存到HashSet中，以自动去重
		String s = sc.nextLine();
		char[] a = s.toCharArray();

		for (char c : a) {			//遍历字符数组并把每个元素增加到HashSet中
			hs.add(c);
		}
		//4.遍历HashSet并打印
		for (Character ch : hs) {
			System.out.print(ch);
		}
		
	}



}
