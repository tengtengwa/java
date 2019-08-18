package cn.ttw.testCollection.testMap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * ����TreeMap
 * @author �����޷���İ�ש
 *
 */

public class TestTreeMap {
	public static void main(String[] args) {
		//Test1();
		//test2();
		
		TreeMap<Student, String> tm = new TreeMap<Student, String>(new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				int num = s1.getName().compareTo(s2.getName());
				return num == 0 ? s1.getAge() - s2.getAge() : num;
			}
			
			
			
			
		});
		tm.put(new Student("zs",23), "beijing");
		tm.put(new Student("ls",24), "shanghai");
		tm.put(new Student("ww",25), "gz");
		tm.put(new Student("zl",26), "sz");
		
		System.out.println(tm);
		
		
		
	}

	public static void test2() {
		TreeMap<Student, String> tm = new TreeMap<Student, String>();
		tm.put(new Student("zs",23), "beijing");
		tm.put(new Student("ls",24), "shanghai");
		tm.put(new Student("ww",25), "gz");
		tm.put(new Student("zl",26), "sz");
		
		System.out.println(tm);
	}

	public static void test1() {
		Map<Integer,String> treemap1 = new TreeMap<>();
		treemap1.put(20, "aa");
		treemap1.put(88, "bb");
		treemap1.put(8, "cc");
		
		for(Integer key:treemap1.keySet()) {
			System.out.println(key+"---"+treemap1.get(key));
		}
		
		Map<Emp,String> treemap2 = new TreeMap<>();
		treemap2.put(new Emp(100,"����",666666),"�����Ǹ��˼�");
		treemap2.put(new Emp(300,"����",8888),"���忴�˿��Ѿ������õĽ�");
		treemap2.put(new Emp(200,"����",5000),"���Ĳ˵Ŀٽ�");
		treemap2.put(new Emp(66,"����",666666),"����666");
		
		for(Emp key:treemap2.keySet()) {
			System.out.println(key+"---"+treemap2.get(key));
		}
	}
}

class Emp implements Comparable<Emp> {
	int id;
	String name;
	double salary;
	
	public Emp(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
		public String toString() {
			return "id:"+id+","+"name:"+name+","+"salary:"+salary;
		}
	
	
	@Override
	public int compareTo(Emp o) {
		
		if(this.salary>o.salary) {
			return -1;
		}else if(this.salary<o.salary) {
			return 1;
		}else {
			if(this.id>o.id) {
				return -1;
			}else if(this.id<o.id) {
				return 1;
			}else {
				return 0;
			}
		}
	}
	
	
	
}

