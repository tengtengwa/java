package cn.ttw.testCollection.testSet;

import java.util.HashSet;
import java.util.Scanner;

/**
 * ��Scanner�Ӽ��̶�ȡһ�����룬ȥ�������ظ����ַ�����ӡ����ͬ���ַ�
 * aaaabbbcccddd
 *
 */

public class Test2 {

	public static void main(String[] args) {
		//1.����Scanner����
		Scanner sc = new Scanner(System.in);
		System.out.println("����һ���ַ���:");
		//2.����HashSet����
		HashSet<Character> hs = new HashSet<>();
		//3.�ַ���ת��Ϊ�ַ����飬��ÿ���ַ����浽HashSet�У����Զ�ȥ��
		String s = sc.nextLine();
		char[] a = s.toCharArray();

		for (char c : a) {			//�����ַ����鲢��ÿ��Ԫ�����ӵ�HashSet��
			hs.add(c);
		}
		//4.����HashSet����ӡ
		for (Character ch : hs) {
			System.out.print(ch);
		}
		
	}



}
