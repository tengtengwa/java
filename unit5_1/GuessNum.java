package cn.ttw.unit5_1;

import java.util.Scanner;

/**
 * ������С��Ϸ
 * 
 * @author �����޷���İ�ש
 *
 */
public class GuessNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����һ��1~20��������");
		int guessNum = (int)(Math.random()*20)+1;
		while(true) {
			int result = sc.nextInt();
			if(result>guessNum) {
				System.out.println("����");
			}else if(result<guessNum) {
				System.out.println("С��");
			}else {
				System.out.println("�̵Ŀٽţ��Ų¶�");
			}
		}
	}
}
