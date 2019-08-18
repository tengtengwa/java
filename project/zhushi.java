package cn.ttw.project;

//方法，对象？

public class zhushi{
	int num=66;
	int age;
	void play()
	{
		System.out.println("lalala"+'\n');
		
	}
	
	public void Stu() {
		String name="二师兄";
		int num;
		String sex;
		
	}
	
	public static void main(String[] args) {
		zhushi kid=new zhushi();
		kid.play();
		System.out.println(kid instanceof zhushi);
		System.out.println(kid instanceof Person);
	}

}

class Person extends zhushi{
	
	public void study(){
 
		
	}
	
	
}

