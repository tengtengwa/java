package cn.ttw.testCollection.collection;

public class Person implements Comparable<Person> {
	private String name;
	private int age;
	
	public Person() {
		super();
		
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	
	/*
	 * 为什么是31？
	 * 1.31是一个质数，质数只能被1和自己本身整除的数
	 * 2.31这个数不大也不小
	 * 3.31这个数好算，2的五次方-1，2向左移动5位
	 */
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)						//调用的对象和传入的对象是同一个对象
			return true;
		if (obj == null)						//传入的对象为null
			return false;
		if (getClass() != obj.getClass())		//判断两个对象对应的字节码文件是否是同一个字节码
			return false;
		Person other = (Person) obj;			//向下转型
		if (age != other.age)					//调用对象的年龄不等于传入对象的年龄
			return false;
		if (name == null) {						//调用对象的姓名为null
			if (other.name != null)				//传入对象的姓名不为null
				return false;
		} else if (!name.equals(other.name))	//调用对象的姓名不等于传入对象的姓名
			return false;
		return true;
	}


	
	
	@Override
	//按姓名排序
	public int compareTo(Person o) {
		int num = this.name.compareTo(o.name);		//按姓名排序
		
		return num == 0 ? this.age - o.age : num;	//姓名是主要条件，年龄是次要条件
	}

	
	
	
	
	/*@Override
	//按年龄排序
	public int compareTo(Person o) {
		int num = this.age - o.age;
		
		return num==0 ? this.name.compareTo(o.name) : num;
	}*/

	/*@Override
	public boolean equals(Object obj) {
		Person p = (Person)obj;
		System.out.println("执行了");
		return this.name.equals(p.name) && this.age == p.age;
	}

	@Override
	public int hashCode() {
		
		return 6;
	}*/
	
	
	
	
	
}
