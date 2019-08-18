package cn.ttw.innerClass;

/**
 * ʹ�������ڲ������PersonDemo�е�method����
 * @author �����޷���İ�ש
 *
 */
public class AnonymousInnerClass3 {
	public static void main(String[] args) {
		PersonDemo pd = new PersonDemo();
		//pd.method(new Student());
		pd.method(new Person() {			//�����ڲ��൱���������ݣ����ʣ��������ڲ��࿴��һ������
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
