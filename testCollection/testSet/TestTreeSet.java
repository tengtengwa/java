package cn.ttw.testCollection.testSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import cn.ttw.testCollection.collection.Person;


/**
 * @author 腾腾娃发光的板砖
 *	TreeSet集合可以对对象排序，同样可以保证元素唯一
 *
 *	当comparaeTo方法返回0的时候集合中只有一个元素
 *	当comparaeTo方法返回1的时候怎么存怎么取
 *	当comparaeTo方法返回-1的时候集合会倒序储存
 */

public class TestTreeSet {

	public static void main(String[] args) {
		//Test1();
		//test2();
		//test3();
		//test4();
		
		TreeSet<String> ts = new TreeSet<>(new CompareBylen());    //Comparator c = new CompareBylen();	优先按照比较器排序
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
		ts.add(new Person("张三",23));
		ts.add(new Person("李四",24));
		ts.add(new Person("赵六",26));
		ts.add(new Person("王五",25));
		
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
	public int compare(String s1, String s2) {		//长度为主要条件，内容为次要条件
		int num = s1.length() - s2.length();
		return num == 0 ? s1.compareTo(s2) : num;
	}
	
	
}






