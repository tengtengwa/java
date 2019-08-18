package cn.ttw.testCollection.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestList2 {

	public static void main(String[] args) {

		ArrayList<Person1> list = new ArrayList<>();
		list.add(new Person1("张三",23));
		list.add(new Person1("李四",24));
		list.add(new Person1("王五",25));
		list.add(new Person1("张三",23));
		list.add(new Person1("李四",24));
		list.add(new Person1("王五",25));
		list.add(new Person1("李四",24));
		list.add(new Person1("王五",25));
		
		ArrayList newList = getSingle(list);
		System.out.println(newList);
	}



		//去除ArrayList中重复的元素
	public void test1() {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("66");
		list.add("66");
		list.add("666");
		list.add("666");
		list.add("d");
		
		ArrayList<String> newList = getSingle(list);
		System.out.println(newList);
	}
	
	public static ArrayList getSingle(ArrayList list) {
		ArrayList newList = new ArrayList<>();
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			Object obj = it.next();
			if(!newList.contains(obj)) {
				newList.add(obj);
			}
		}
		return newList;
	}
}

class Person1{
	private String name;
	private int age;
	
	public Person1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Person1() {
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

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Person1 p = (Person1)obj;
		return this.name.equals(p.name) && this.age == p.age;
	}

	
	
	
}

