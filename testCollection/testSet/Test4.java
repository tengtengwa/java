package cn.ttw.testCollection.testSet;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * �ڼ����д������������ظ����ַ���������һ�����������������ֵ�˳�򣩣����Ҳ���ȥ���ظ�
 *
 */


public class Test4 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("666");
		list.add("hahaha");
		list.add("lalala");
		list.add("wulawula");
		list.add("guajiguaji");
		list.add("honglingjin");
		list.add("aaa");
		list.add("666");
		
		sort(list);
		
		System.out.println(list);
		
	}
	
	//���裺
	//�½�һ��TreeSet���϶�����Ϊ��String������бȽ������ܣ������ᱣ���ظ��������ñȽ���
	//��list����������Ԫ����ӵ�TreeSet�����У��������򲢱����ظ�
	//���list����
	//��TreeSet�����е��ź��������Ԫ����ӵ�list������
	public static void sort(ArrayList<String> list) {
		TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {		//�����ڲ���

			@Override
			public int compare(String s1, String s2) {
				int num = s1.compareTo(s2);				//�Ƚ�����Ϊ��Ҫ����
				return num == 0 ? 1 : num;				//���ط������Ա����ظ�
			}
			
		});
		ts.addAll(list);
		list.clear();
		list.addAll(ts);
		
		
		
		
	}
}





