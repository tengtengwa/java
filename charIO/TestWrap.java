package cn.ttw.charIO;

/**
 * ����װ�����ģʽ
 * 	�ŵ㣺
 * 		����Բ�ǿ����װ�ε���ı仯��װ����ı仯�޹�
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

class mobile implements Coder {		//װ����Ϊmobile����װ����ΪStudent
	//1.��ȡ��װ���������
	private Student s;
	
	//2.�ڹ��췽���д��뱻װ����Ķ���
	public mobile(Student s) {
		this.s = s;
	}
	//3.��ԭ�й��ܽ�������
	@Override
	public void code() {
		s.code();
		System.out.println("ssh");
		System.out.println("datebase");
		System.out.println("bigdate");
		System.out.println("...");
	}
	
	
	
}






