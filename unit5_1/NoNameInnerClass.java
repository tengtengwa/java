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
		
		
		new Inter() {							//实现Inter接口
			public void print() {				//重写抽象方法
				System.out.println("print");
			}
		}.print();
		
		
	}
	
}

