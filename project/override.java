package cn.ttw.project;

/**
 * ��д��ϰ
 * @author �����޷���İ�ש
 *
 */

public class override {
	public static void main(String[] args) {
		Taijun quan = new Taijun();
		Taijun zhang = new Taijun();
		System.out.println(quan.equals(zhang));
		
	}
}

class Guizi{
	String name = "qsj";
	
	public void eatshit() {
		System.out.println("����!");
		
	}
	
}

class Children extends Guizi{
	void eat() {
		System.out.println(name);
		
	}
	
}

class Taijun extends Guizi{
	int num;
	String name;
	
	
	
	public void eatshit() {
		System.out.println("�ټ�һ��"+'\n');  
	}
	
	
}





