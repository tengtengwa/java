package cn.ttw.unit5_1;

public class NoNameInnerClass {
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
			System.out.println("pirnt");
		}
	}
	
	public void method() {
		//Inner i = new Inner();
		//i.print();
		
		
		new Inter() {							//ʵ��Inter�ӿ�
			public void print() {				//��д���󷽷�
				System.out.println("print");
			}
		}.print();
		
		
	}
	
}

