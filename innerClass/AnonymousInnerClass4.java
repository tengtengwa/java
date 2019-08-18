package cn.ttw.innerClass;

public class AnonymousInnerClass4 {
	public static void main(String[] args) {
		//Outer.method().show();		//链式编程：每次调用方法后还能继续调用方法，所以调用方法返回的是对象
		Inter i = Outer.method();
		i.show();
	}
}

interface Inter{
	void show();
}

class Outer {
	public static Inter method() {
		return new Inter() {			//返回Inter的子类对象
			public void show() {
				System.out.println("Hello World");
			}
		};
	}
}

