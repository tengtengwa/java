package cn.ttw.unit7;

public class TestString2 {
	public static void main(String[] args) {
		//demo1();
		//demo2();
		
		String s1 = "xiyou";
		String s2 = "";			//""���ַ���������ͬʱ��һ��String������Ƕ���ȿ��Ե���String���еķ���
		String s3 = null;		//null�ǿճ��������ܵ����κη�����������ֿ�ָ���쳣��null�������Ը����������������͸�ֵ
		
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
		//System.out.println(s3.isEmpty());		//��ָ���쳣
		
	}

	private static void demo2() {
		String s1 = "����������";
		String s2 = "������";
		String s3 = "���ڶ���";
		String s4 = "����";
		String s5 = "��";
		
		System.out.println(s1.contains(s2));		//�ж��Ƿ����������ַ���
		System.out.println(s1.contains(s3));
		
		System.out.println(s1.startsWith(s4));
		System.out.println(s1.startsWith(s5));
		
		System.out.println(s1.endsWith(s5));
		System.out.println(s1.endsWith(s2));
	}
	
	
	
	
	
	
	
	private static void demo1() {
		
		String s1 = "ttw";
		String s2 = "ttw";
		String s3 = "TTw";
		
		System.out.println(s1.equals(s2));	//equals�������ִ�Сд
		System.out.println(s2.equals(s3));
		
		System.out.println("-------------------");
		
		System.out.println(s1.equalsIgnoreCase(s2));	//equalsIgnoreCase���������ִ�Сд
		System.out.println(s1.equalsIgnoreCase(s3));		
	}
	
}


