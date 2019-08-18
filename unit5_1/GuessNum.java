package cn.ttw.unit5_1;

import java.util.Scanner;

/**
 * 猜数字小游戏
 * 
 * @author 腾腾娃发光的板砖
 *
 */
public class GuessNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个1~20的整数：");
		int guessNum = (int)(Math.random()*20)+1;
		while(true) {
			int result = sc.nextInt();
			if(result>guessNum) {
				System.out.println("大了");
			}else if(result<guessNum) {
				System.out.println("小了");
			}else {
				System.out.println("蔡的抠脚，才猜对");
			}
		}
	}
}
