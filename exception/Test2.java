package cn.ttw.exception;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 	练习：
 * 		键盘录入一个int类的整数，对其求二进制
 * 		如果录入的整数过大，给予提示并重新输入
 * 		如果录入的是小数，给予提示并重新输入
 * 		如果录入的是其他字符，给予提示并重新输入
 */

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		while(true) {
			String line = sc.nextLine();
			try {
				int num = Integer.parseInt(line);
				System.out.println(Integer.toBinaryString(num));	//将整数转换为二进制
				break;
			}catch(Exception e) {
				try {
					new BigInteger(line);
					System.out.println("错误，录入整数过大，请重新输入");
				}catch(Exception e2) {
					try {
						new BigDecimal(line);
						System.out.println("错误，录入了浮点数，请重新输入");
					} catch (Exception e1) {								//alt + shitf + z：try catch快捷键
						System.out.println("错误，录入了非法字符，请重新输入");
					}
				}
			}			
		}

		
		
		
	}
}
