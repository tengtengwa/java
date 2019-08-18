package cn.ttw.charIO;

/**
 * 测试装饰设计模式
 * 	优点：
 * 		耦合性不强，被装饰的类的变化与装饰类的变化无关
 */

public class TestWrap {

	public static void main(String[] args) {
		mobile m = new mobile(new Student());
		m.code();
		
		
		
		
	}
}

interface Coder {
	public void code();
	
}

class Student implements Coder {

	@Override
	public void code() {
		System.out.println("javase");
		System.out.println("javaweb");
	}
	
	
}

class mobile implements Coder {		//装饰类为mobile，被装饰类为Student
	//1.获取被装饰类的引用
	private Student s;
	
	//2.在构造方法中传入被装饰类的对象
	public mobile(Student s) {
		this.s = s;
	}
	//3.对原有功能进行升级
	@Override
	public void code() {
		s.code();
		System.out.println("ssh");
		System.out.println("datebase");
		System.out.println("bigdate");
		System.out.println("...");
	}
	
	
	
}






