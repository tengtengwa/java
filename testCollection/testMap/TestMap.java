package cn.ttw.testCollection.testMap;
/**
 * ����HashMap
 * 
 * @author �����޷���İ�ש
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
		m2.put(4, "��");
		m2.put(5, "��");
		
		m1.putAll(m2);
		System.out.println(m1);
		
		//map�еļ������ظ�!����ظ����Ƿ��ظ�����equals�����жϣ������µĸ��Ǿɵ�
		m1.put(3, "��");
		System.out.println(m1);
		
		
		
		
		
		
		Employee e1 = new Employee(1001,"ttw",666666);
		Employee e2 = new Employee(1002,"lll",5000);
		Employee e3 = new Employee(1003,"aaa",3000);
		Employee e4 = new Employee(1001,"kkk",6);
		
		Map<Integer,Employee> map = new HashMap<>();
		map.put(1001, e1);
		map.put(1002, e2);
		map.put(1003, e3);
		map.put(1001, e4);				//�¶��󸲸Ǿɵ�
		
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












