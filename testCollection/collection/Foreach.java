package cn.ttw.testCollection.collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 * ������ǿforѭ��
 *
 */

public class Foreach {

	public static void main(String[] args) {
		
		//Test1();
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("d");
		
		
		//1.��ͨforѭ��ɾ��������Ҫ--
		for(int i=0;i<list.size();i++) {
			if("b".equals(list.get(i))) {
				list.remove(i--);
			}
		}
		System.out.println(list);
		
		
		//2.������ɾ�����õ������ṩ��remove����
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			if("b".equals(it.next())) {
				//list.remove("b");				//�����ü��ϵ�ɾ����������Ϊ���������л���ֲ����޸��쳣
				it.remove();
			}
		}
		System.out.println(list);
		
		for(Iterator<String> it2 = list.iterator(); it2.hasNext();) {
			if("b".equals(it2.next())) {
				it2.remove();
			}
		}
		System.out.println(list);
		
		//3.��ǿforѭ������ɾ����ֻ�ܱ���
		for (String string : list) {
			if("b".equals(string)) {
				list.remove("b");
			}
		}
		System.out.println(list);
		
		
	}

	public static void test1() {
		int[] arr = {11,2,5,6,98,34};
		for(int i:arr) {						//forѭ���ײ��������ǵ�����
			System.out.println(i);
		}
		
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("v");
		for (String string : list) {
			System.out.println(string);
		}
	}
}
