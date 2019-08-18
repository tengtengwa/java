package cn.ttw.testCollection.testMap;
/**
 * 测试HashMap
 * 
 * @author 腾腾娃发光的板砖
 *
 */

import java.util.HashMap;
import java.util.Map;

public class TestMap {
	public static void main(String[] args) {
		Map<Integer,String> m1 = new HashMap<>();
		m1.put(1, "one");
		m1.put(2,"two");
		m1.put(3, "three");
		
		System.out.println(m1.get(1));
		System.out.println(m1.size());
		System.out.println(m1.containsKey(2));
		System.out.println(m1.containsValue("one"));
		
		Map<Integer,String> m2 = new HashMap<>();
		m2.put(4, "四");
		m2.put(5, "五");
		
		m1.putAll(m2);
		System.out.println(m1);
		
		//map中的键不能重复!如果重复（是否重复根据equals方法判断），则新的覆盖旧的
		m1.put(3, "三");
		System.out.println(m1);
		
		
		
		
		
		
		Employee e1 = new Employee(1001,"ttw",666666);
		Employee e2 = new Employee(1002,"lll",5000);
		Employee e3 = new Employee(1003,"aaa",3000);
		Employee e4 = new Employee(1001,"kkk",6);
		
		Map<Integer,Employee> map = new HashMap<>();
		map.put(1001, e1);
		map.put(1002, e2);
		map.put(1003, e3);
		map.put(1001, e4);				//新对象覆盖旧的
		
		Employee emp = map.get(1001);
		System.out.println(emp.getName());
	}
}


class Employee{
	private int id;
	private String name;
	private double salary;
	
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
}












