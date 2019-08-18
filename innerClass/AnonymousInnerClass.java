package cn.ttw.innerClass;

/**
 * @author 腾腾娃发光的板砖
 *	匿名内部类：内部类的简化写法
 *	A:前提：存在一个(具体或抽象)类或接口
 *	B：格式：	
 *			new 类名或接口名(){
 *				重写方法;
 *			}
 *	C:本质：是一个继承了该类或实现了该接口的子类匿名（对象）
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
		
 		new Inter() {							//实现Inter接口;相当于Inter的子类对象
			public void print() {				//重写抽象方法
				System.out.println("print");
			}
		}.print();
	}
}

*/
