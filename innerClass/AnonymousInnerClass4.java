package cn.ttw.innerClass;

public class AnonymousInnerClass4 {
	public static void main(String[] args) {
		//Outer.method().show();		//��ʽ��̣�ÿ�ε��÷������ܼ������÷��������Ե��÷������ص��Ƕ���
		Inter i = Outer.method();
		i.show();
	}
}

interface Inter{
	void show();
}

class Outer {
	public static Inter method() {
		return new Inter() {			//����Inter���������
			public void show() {
				System.out.println("Hello World");
			}
		};
	}
}

