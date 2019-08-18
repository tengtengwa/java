package cn.ttw.unit7;

import java.util.Scanner;

public class TestScanner {


	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in); 
//	 	System.out.println("输入第一个整数："); 
//	 	int i = sc.nextInt(); 
//		System.out.println("输入第二个整数");
//		int j = sc.nextInt();
//		System.out.println("i = "+i+",j = "+j);
		 
//		System.out.println("输入第一个字符串：");
//		String line1 = sc.nextLine();
//		System.out.println("输入第一个字符串：");
//		String line2 = sc.nextLine();
//		System.out.println("line1 = "+line1+",line2 = "+line2);
		
//		System.out.println("输入一个整数：");
//		int i = sc.nextInt();
//		
//		System.out.println("输入一个字符串：");
//		String line2 = sc.nextLine();
//		System.out.println("i = "+i+",line2 = "+line2);
		
		int i = sc.nextInt();
		Scanner sc2 = new Scanner(System.in);
		
	}
}

class Test1{
	
	Scanner sc = new Scanner(System.in);
	{
		if(sc.hasNextLine()) {
			String i = sc.nextLine();			
			System.out.println(i);
		}else {
			System.out.println("input error");
		}
	}
}