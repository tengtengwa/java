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
	 * Ϊʲô��31��
	 * 1.31��һ������������ֻ�ܱ�1���Լ�������������
	 * 2.31���������Ҳ��С
	 * 3.31��������㣬2����η�-1��2�����ƶ�5λ
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
		if (this == obj)						//���õĶ���ʹ���Ķ�����ͬһ������
			return true;
		if (obj == null)						//����Ķ���Ϊnull
			return false;
		if (getClass() != obj.getClass())		//�ж����������Ӧ���ֽ����ļ��Ƿ���ͬһ���ֽ���
			return false;
		Person other = (Person) obj;			//����ת��
		if (age != other.age)					//���ö�������䲻���ڴ�����������
			return false;
		if (name == null) {						//���ö��������Ϊnull
			if (other.name != null)				//��������������Ϊnull
				return false;
		} else if (!name.equals(other.name))	//���ö�������������ڴ�����������
			return false;
		return true;
	}


	
	
	@Override
	//����������
	public int compareTo(Person o) {
		int num = this.name.compareTo(o.name);		//����������
		
		return num == 0 ? this.age - o.age : num;	//��������Ҫ�����������Ǵ�Ҫ����
	}

	
	
	
	
	/*@Override
	//����������
	public int compareTo(Person o) {
		int num = this.age - o.age;
		
		return num==0 ? this.name.compareTo(o.name) : num;
	}*/

	/*@Override
	public boolean equals(Object obj) {
		Person p = (Person)obj;
		System.out.println("ִ����");
		return this.name.equals(p.name) && this.age == p.age;
	}

	@Override
	public int hashCode() {
		
		return 6;
	}*/
	
	
	
	
	
}
