package cn.ttw.unit7;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		//Test1();
		//test2();
		//test3();
		//test4();
		
		
	}

	private static void test4() {
		String s1 = "xiyoumobile";
		String s2 = s1.substring(5);
		System.out.println(s2);
		String s3 = s1.substring(0, 2);			//左闭右开
		System.out.println(s3);
	}

	private static void test3() {
		String s1 = "haohaoxuexi";
		System.out.println(s1.indexOf("hao", 3));	//返回指定位置后第一次出现该字符串的首个字符的索引
		System.out.println(s1.indexOf('a', 3));		//返回指定位置后第一次出现该字符的索引
		System.out.println(s1.lastIndexOf('x'));
		System.out.println(s1.lastIndexOf("hao", 3));	//返回指定位置前第一次出现该字符串的最后一个字符的索引
	}

	private static void test2() {
		String s1 = "what are you doing ";
		System.out.println(s1.charAt(3));			//获取指定位置的字符下标
		System.out.println(s1.indexOf('w'));		//获取指定字符的下标
		System.out.println(s1.indexOf("are"));		//获取字符串第一个字符的下标
	}
	
	private static void test1() {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			
			System.out.println("input account:");
			String account = sc.nextLine();
			System.out.println("input password:");
			String passw = sc.nextLine();
			
			if("admin".equals(account) && "admin".equals(passw)) {		//字符串常量和字符串变量比较，通常常量调用方法，将变量当作参数，防止空指针异常
				System.out.println("欢迎登陆");
				break;
			}else {
				System.out.println("account or password error");
			}
		}
	}
	
}
