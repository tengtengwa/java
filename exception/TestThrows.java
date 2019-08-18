package cn.ttw.exception;

/**
 * 
 * ����ʱ�쳣���׳����������д���
 * ����ʱ�쳣���׳����Դ���Ҳ���Բ�����
 * 
 */

public class TestThrows {

	public static void main(String[] args) throws Exception {	//throws���ڷ��������󣬸������쳣����; ���Ը�����쳣�������ö��Ÿ���; ��ʾ�׳��쳣���ɸ÷����ĵ����ߴ���
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
//			Exception e = new Exception("����Ƿ�");
//			throw e;		//throw�׳�һ���쳣����
			
			throw new AgeOutOfBoundsException("����Ƿ�");
		}
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
}