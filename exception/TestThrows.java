package cn.ttw.exception;

/**
 * 
 * 编译时异常地抛出必须对其进行处理
 * 运行时异常的抛出可以处理，也可以不处理
 * 
 */

public class TestThrows {

	public static void main(String[] args) throws Exception {	//throws用在方法声明后，跟的是异常类名; 可以跟多个异常类名，用逗号隔开; 表示抛出异常，由该方法的调用者处理
		Person p = new Person();
		p.setAge(-17);
		System.out.println(p.getAge());
		
		
	}
}

class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Person() {
		super();
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws AgeOutOfBoundsException {
		if(age >= 0 && age <= 130) {
			this.age = age;
		}else {
//			Exception e = new Exception("年龄非法");
//			throw e;		//throw抛出一个异常对象
			
			throw new AgeOutOfBoundsException("年龄非法");
		}
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
}