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
		String s3 = s1.substring(0, 2);			//����ҿ�
		System.out.println(s3);
	}

	private static void test3() {
		String s1 = "haohaoxuexi";
		System.out.println(s1.indexOf("hao", 3));	//����ָ��λ�ú��һ�γ��ָ��ַ������׸��ַ�������
		System.out.println(s1.indexOf('a', 3));		//����ָ��λ�ú��һ�γ��ָ��ַ�������
		System.out.println(s1.lastIndexOf('x'));
		System.out.println(s1.lastIndexOf("hao", 3));	//����ָ��λ��ǰ��һ�γ��ָ��ַ��������һ���ַ�������
	}

	private static void test2() {
		String s1 = "what are you doing ";
		System.out.println(s1.charAt(3));			//��ȡָ��λ�õ��ַ��±�
		System.out.println(s1.indexOf('w'));		//��ȡָ���ַ����±�
		System.out.println(s1.indexOf("are"));		//��ȡ�ַ�����һ���ַ����±�
	}
	
	private static void test1() {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			
			System.out.println("input account:");
			String account = sc.nextLine();
			System.out.println("input password:");
			String passw = sc.nextLine();
			
			if("admin".equals(account) && "admin".equals(passw)) {		//�ַ����������ַ��������Ƚϣ�ͨ���������÷�����������������������ֹ��ָ���쳣
				System.out.println("��ӭ��½");
				break;
			}else {
				System.out.println("account or password error");
			}
		}
	}
	
}
