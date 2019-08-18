package cn.ttw.testCollection.testSet;

import java.util.HashSet;
import java.util.Set;

import cn.ttw.testCollection.collection.Person;

/**
 * ����HashSet
 * 
 *	Set�������������������ظ������򣨴�ȡ��һ�£�
 *	
 *	
 */

public class TestHashSet {

	public static void main(String[] args) {
		//Test1();
		HashSet<Person> hs = new HashSet<>();
		hs.add(new Person("����",23));			//δ����д��equals�����Ƚϵ��ǵ�ֵַ���½�����ĵ�ַ����ͬ����ʱequals����������false
		hs.add(new Person("����",23));
		hs.add(new Person("����",24));
		hs.add(new Person("����",24));
		hs.add(new Person("����",24));
		hs.add(new Person("����",23));
		System.out.println(hs);
	}

	public static void test1() {
		Set<String> set1 = new HashSet<>();
		
		set1.add("aa");
		set1.add("bb");
		set1.add("aa");
		System.out.println(set1);
		set1.remove("aa");
		System.out.println(set1);
		
		Set<Integer> set2 = new HashSet<>();
		set2.add(6);
		set2.add(66);
		System.out.println(set2);
		
		for (Integer integer : set2) {
			System.out.println(integer);
		}
	}
}
