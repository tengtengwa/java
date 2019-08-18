package cn.ttw.testCollection.testMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * ģ�⶷����ϴ�ƺͷ���
 * 1.�������϶��󣬽��˿��ƴ���
 * 2.ϴ��
 * 3.����
 * 4.����
 * 
 */


public class Test22 {

	public static void main(String[] args) {
		String[] num = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
		String[] color = {"����","����","��Ƭ","÷��"};
		HashMap<Integer, String> hm = new HashMap<>();		//�����������˿���
		ArrayList<Integer> list = new ArrayList<>();		//��������
		int index = 0;
		
		for(String s1 : num) {
			for(String s2 : color) {
				hm.put(index, s2.concat(s1));
				list.add(index++);
			}
		}
		hm.put(index, "С��");
		list.add(index++);
		hm.put(index, "����");
		list.add(index);
		//ϴ��
		Collections.shuffle(list);
		//����
		TreeSet<Integer> fgds = new TreeSet<>();
		TreeSet<Integer> axing = new TreeSet<>();
		TreeSet<Integer> ttw = new TreeSet<>();
		TreeSet<Integer> dipai = new TreeSet<>();
		
		for(int i=0;i<list.size();i++) {
			if(i>=list.size()-3) {
				dipai.add(list.get(i));
			}else if(i % 3 == 0) {
				fgds.add(list.get(i));
			}else if(i % 3 == 1) {
				axing.add(list.get(i));
			}else {
				ttw.add(list.get(i));
			}
		}
		//����
		lookPoker(hm, fgds, "fgds");
		lookPoker(hm, axing, "axing");
		lookPoker(hm, ttw, "ttw");
		lookPoker(hm, dipai, "dipai");
	}
	
	
	public static void lookPoker(HashMap<Integer,String> hm, TreeSet<Integer> ts, String name) {
		System.out.println(name + "�����ǣ�");
		for(Integer i : ts)	{
			System.out.print(hm.get(i) + " ");
		}
		System.out.println();
	}
	
	
	
	
	
}
