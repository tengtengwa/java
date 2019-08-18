package cn.ttw.testCollection.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * Collections������Ĳ���
 *
 */

public class TestCollections {
	public static void main(String[] args) {
		//test1();
		test2();
		
		
	}

	public static void test2() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("c");
		list.add("6");
		list.add("a");
		list.add("d");
		list.add("b");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		System.out.println(Collections.binarySearch(list, "c"));
		System.out.println(Collections.max(list));
	}

	public static void test1() {
		List<String> list = new ArrayList<>();
		for(int i=0;i<10;i++) {
			list.add("ttw"+i);
		}
		System.out.println(list);
		
		Collections.shuffle(list);		//�������list�е�Ԫ��
		System.out.println(list);
		
		Collections.reverse(list);		//��������
		System.out.println(list);
		
		Collections.sort(list);			//�����ķ�ʽ����(ͨ��Comparable�ӿ�)
		System.out.println(list);
		
		System.out.println(Collections.binarySearch(list, "ttw6"));		//�۰����
	}
}
