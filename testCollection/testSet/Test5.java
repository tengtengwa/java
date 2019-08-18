package cn.ttw.testCollection.testSet;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * �Ӽ��̽���һ���ַ������������ַ���������(��ȥ��)���磺helloitcast -> acehillostt
 * 
 */

/**
 * ������
 * 1.�½�Scanner����¼���ַ���
 * 2.���ַ���ת��Ϊ�ַ�����
 * 3.����TreeSet���ϣ�����Ƚ������ַ����򲢱����ظ�
 * 4.�����ַ����飬��ÿһ���ַ�������TreeSet������
 * 5.����TreeSet���ϣ���ӡÿһ���ַ�
 */

public class Test5 {

	private static Scanner sc;

	public static void main(String[] args) {
		//1.
		sc = new Scanner(System.in);
		System.out.println("����һ���ַ���:");
		String s = sc.nextLine();
		//2.
		char[] arr = s.toCharArray();
		//3.
		TreeSet<Character> ts = new TreeSet<>(new Comparator<Character>() {		//ע�⣺��������Ϊ��װ�࣬����Ϊ������������

			@Override
			public int compare(Character c1, Character c2) {
				//int num = c1 - c2;					//�Զ�����
				int num = c1.compareTo(c2);
				return num == 0 ? 1 : num;
			}
			
		});
		
		//4.
		for (Character c : arr) {
			ts.add(c);				//�Զ�װ��
		}
		
		for (Character cc : ts) {
			System.out.print(cc);	
		}
		
			
	}	
}

