package cn.ttw.project;

/**
 * 重写练习
 * @author 腾腾娃发光的板砖
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
		System.out.println("真香!");
		
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
		System.out.println("再加一吨"+'\n');  
	}
	
	
}





