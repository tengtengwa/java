package cn.ttw.unit5_1;

/**
 * 测试初始化块
 * @author 腾腾娃发光的板砖
 *
 */
public class Demo1_Code {
	public static void main(String[] args) {
		{
			int x = 10;
			System.out.println(x);
		}
		
		Student s1 = new Student();
		System.out.println("------------");
		Student s2 = new Student("小明",66);
		System.out.println("------------");
		Student s3 = new Student();
		System.out.println("------------");
		Student s4 = new Student("lalala",27);
		
	}
}

class Student{
	private String name;
	private int age;
	
	public Student() {
		System.out.println("空参构造");
	}
	
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
		System.out.println("有参构造");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName(String name) {
		return name;
	}
	
	public void setAge(int age) {
		this.age  = age;
	}
	
	public int getAge() {
		return age;
	}
	
	{
		study();
		//System.out.println("构造代码块");
	}
	
	public void study() {
		System.out.println("学生学习");
	}
	
	static {										//随着类的加载而加载，且只执行一次
		System.out.println("我是静态代码块");		//作用：用来给类初始化，一般用来加载驱动
	}												//静态代码块是优先于主方法执行
	
}

