package cn.ttw.innerClass;

/**
 * 使用匿名内部类调用PersonDemo中的method方法
 * @author 腾腾娃发光的板砖
 *
 */
public class AnonymousInnerClass3 {
	public static void main(String[] args) {
		PersonDemo pd = new PersonDemo();
		//pd.method(new Student());
		pd.method(new Person() {			//匿名内部类当作参数传递（本质：把匿名内部类看作一个对象）
			public void show() {
				System.out.println("show");
			}
		});
	}
}

abstract class Person{
	public abstract void show();
}

class PersonDemo{
	public void method(Person p) {		//Person p = new Student();
		p.show();
	}
}

class Student extends Person{
	public void show() {
		System.out.println("show");
	}
	
}
