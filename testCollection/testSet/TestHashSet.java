package cn.ttw.testCollection.testSet;

import java.util.HashSet;
import java.util.Set;

import cn.ttw.testCollection.collection.Person;

/**
 * 测试HashSet
 * 
 *	Set集合无索引，不可以重复，无序（存取不一致）
 *	
 *	
 */

public class TestHashSet {

	public static void main(String[] args) {
		//Test1();
		HashSet<Person> hs = new HashSet<>();
		hs.add(new Person("张三",23));			//未经重写的equals方法比较的是地址值，新建对象的地址都不同，此时equals方法都返回false
		hs.add(new Person("张三",23));
		hs.add(new Person("李四",24));
		hs.add(new Person("李四",24));
		hs.add(new Person("李四",24));
		hs.add(new Person("张三",23));
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
