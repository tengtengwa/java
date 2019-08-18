package cn.ttw.testCollection.testSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import cn.ttw.testCollection.collection.Person;


/**
 * @author �����޷���İ�ש
 *	TreeSet���Ͽ��ԶԶ�������ͬ�����Ա�֤Ԫ��Ψһ
 *
 *	��comparaeTo��������0��ʱ�򼯺���ֻ��һ��Ԫ��
 *	��comparaeTo��������1��ʱ����ô����ôȡ
 *	��comparaeTo��������-1��ʱ�򼯺ϻᵹ�򴢴�
 */

public class TestTreeSet {

	public static void main(String[] args) {
		//Test1();
		//test2();
		//test3();
		//test4();
		
		TreeSet<String> ts = new TreeSet<>(new CompareBylen());    //Comparator c = new CompareBylen();	���Ȱ��ձȽ�������
		ts.add("a");
		ts.add("bbq");
		ts.add("zuohuisi");
		ts.add("woca");
		ts.add("lalala");
		
		System.out.println(ts);
		
	}

	public static void test4() {
		TreeSet<Person> ts = new TreeSet<Person>();
		ts.add(new Person("zhangsan",23));
		ts.add(new Person("lisi",24));
		ts.add(new Person("zhaoliu",26));
		ts.add(new Person("wangwu",25));
		ts.add(new Person("666666",25));
		
		System.out.println(ts);
	}

	public static void test3() {
		TreeSet<Person> ts = new TreeSet<Person>();
		ts.add(new Person("����",23));
		ts.add(new Person("����",24));
		ts.add(new Person("����",26));
		ts.add(new Person("����",25));
		
		System.out.println(ts);
	}

	public static void test2() {
		test3();
	}

	public static void test1() {
		Set<Integer> set = new TreeSet<>();
		
		set.add(300);
		set.add(200);
		set.add(600);
		set.add(600);
		
		for(Integer m:set) {
			System.out.println(m);
		}
	}

}

class CompareBylen implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {		//����Ϊ��Ҫ����������Ϊ��Ҫ����
		int num = s1.length() - s2.length();
		return num == 0 ? s1.compareTo(s2) : num;
	}
	
	
}






