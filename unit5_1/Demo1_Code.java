package cn.ttw.unit5_1;

/**
 * ���Գ�ʼ����
 * @author �����޷���İ�ש
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
		Student s2 = new Student("С��",66);
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
		System.out.println("�ղι���");
	}
	
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
		System.out.println("�вι���");
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
		//System.out.println("��������");
	}
	
	public void study() {
		System.out.println("ѧ��ѧϰ");
	}
	
	static {										//������ļ��ض����أ���ִֻ��һ��
		System.out.println("���Ǿ�̬�����");		//���ã����������ʼ����һ��������������
	}												//��̬�������������������ִ��
	
}

