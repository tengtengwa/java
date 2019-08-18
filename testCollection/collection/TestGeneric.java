package cn.ttw.testCollection.collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ²âÊÔ·ºÐÍ
 * @author ÌÚÌÚÍÞ·¢¹âµÄ°å×©
 *
 */

public class TestGeneric {
	public static void main(String[] args) {
		MyCollection<String> mc = new MyCollection<String>();
		mc.set("ttw", 0);
		mc.set("666", 1);
		
		String s = mc.get(0);
		String a = mc.get(1);
		
		
		
		
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Tool<String> t = new Tool<>();
		t.show("abc");
		t.show(true);
	}
	
}

class MyCollection<E> {
	Object[] objs = new Object[5];
	
	public void set(E e,int index) {
		objs[index] = e;
	}
	
	public E get(int index) {
		return (E)objs[index];
	}
	
}

interface Inter<T>{
	public void show(T t);
}

class Hape implements Inter<String>{

	@Override
	public void show(String t) {
		System.out.println(t);
	}
	
}






