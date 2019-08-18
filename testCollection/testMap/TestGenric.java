package cn.ttw.testCollection.testMap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * ���͹̶��±߽�
 * ? super E
 * 
 * ���͹̶��ϱ߽�
 * ? extends E
 * 
 */


public class TestGenric {

	public static void main(String[] args) {
		//Test1();
		
		TreeSet<Student> ts1 = new TreeSet<>(new CompareByAge());
		ts1.add(new Student("zs",33));
		ts1.add(new Student("ls",44));
		ts1.add(new Student("ww",55));
		ts1.add(new Student("zl",66));
		
		TreeSet<BaseStudent> ts2 = new TreeSet<>(new CompareByAge());	//? super E		�����༯�Ϸ��븸�෺���бȽ�
		ts2.add(new BaseStudent("zs",33));
		ts2.add(new BaseStudent("ls",44));
		ts2.add(new BaseStudent("ww",55));
		ts2.add(new BaseStudent("zl",66));
		System.out.println(ts2);
		
		
		
	}

	public static void test1() {
		ArrayList<Student> list1 = new ArrayList<>();
		list1.add(new Student("����",23));
		list1.add(new Student("����",24));
		
		ArrayList<BaseStudent> list2 = new ArrayList<>();
		list2.add(new BaseStudent("����",25));
		list2.add(new BaseStudent("����",26));
		list1.addAll(list2);					//? extends E	�����༯�Ϸ��븸�༯����
		System.out.println(list1);
	}
}

class CompareByAge implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		int num = s1.getAge() - s2.getAge();
		return num == 0 ? s1.getName().compareTo(s2.getName()) : num;
	}
	
	
}

