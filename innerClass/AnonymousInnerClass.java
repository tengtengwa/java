package cn.ttw.innerClass;

/**
 * @author �����޷���İ�ש
 *	�����ڲ��ࣺ�ڲ���ļ�д��
 *	A:ǰ�᣺����һ��(��������)���ӿ�
 *	B����ʽ��	
 *			new ������ӿ���(){
 *				��д����;
 *			}
 *	C:���ʣ���һ���̳��˸����ʵ���˸ýӿڵ���������������
 */


/*

public class AnonymousInnerClass {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.method();
	}
}


interface Inter{
	public void print();
}

class Outer{
	class Inner implements Inter{
		public void print() {
			System.out.println("print");
		}
	}
	
	public void method() {
//		Inner i = new Inner();
//		i.print();
		new Inner().print();
		
 		new Inter() {							//ʵ��Inter�ӿ�;�൱��Inter���������
			public void print() {				//��д���󷽷�
				System.out.println("print");
			}
		}.print();
	}
}

*/
