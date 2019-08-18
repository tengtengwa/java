package cn.ttw.testCollection.testSet;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入学生姓名和成绩：");
		
		TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				int num = s2.getSum()-s1.getSum();
				return num == 0 ? 1 : num;
			}
		});
		
		while(ts.size()<5) {
			String line = sc.nextLine();
			String[] arr = line.split(" ");
			int chi = Integer.parseInt(arr[1]);
			int math = Integer.parseInt(arr[2]);
			int eng = Integer.parseInt(arr[3]);
			ts.add(new Student(arr[0], chi, math, eng));		//在每次输入后创建student类对象，不用提前创建好每个对象
		}
			System.out.println("排序后的学生信息：");
			for (Student stu : ts) {
				System.out.println(stu);
			}
		
	}
}





class Student{
	private String name;
	private int chi;
	private int math;
	private int eng;
	private int sum;
	
	public Student(String name, int chi, int math, int eng) {
		super();
		this.name = name;
		this.chi = chi;
		this.math = math;
		this.eng = eng;
		this.sum = this.chi + this.math + this.eng;
	}

	public int getSum() {
		return sum;
	}

	public Student() {
		super();
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getChi() {
		return chi;
	}

	public void setChi(int chi) {
		this.chi = chi;
	}

	public double getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public double getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", chi=" + chi + ", math=" + math + ", eng=" + eng + "]";
	}
	
	
	
}
