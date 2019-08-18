package cn.ttw.testCollection.testMap;

import java.util.ArrayList;
import java.util.Collections;

/**
 * ģ�⶷����ϴ�ƺͷ���
 * 1.�������϶��󣬽��˿��ƴ���
 * 2.ϴ��
 * 3.����
 * 4.����
 * 
 */


public class Test21 {

	public static void main(String[] args) {
		String[] num = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
		String[] color = {"����","����","��Ƭ","÷��"};

		ArrayList<String> poker = new ArrayList<>();
		
		for(String s1 : color) {
			for(String s2 : num) {
				poker.add(s1.concat(s2));
			}
		}

		poker.add("����");
		poker.add("С��");
		Collections.shuffle(poker);
		System.out.println(poker);
		
		ArrayList<String> fgds = new ArrayList<String>();
		ArrayList<String> me = new ArrayList<String>();
		ArrayList<String> axing = new ArrayList<String>();
		ArrayList<String> dipai = new ArrayList<String>();
		
		for(int i=0;i<poker.size();i++) {
			if(i>=poker.size()-3) {				//���������Ϊ����
				dipai.add(poker.get(i));
			}else if(i % 3 == 0){
				axing.add(poker.get(i));
			}else if(i % 3 == 1) {
				fgds.add(poker.get(i));
			}else {
				me.add(poker.get(i));
			}
		}
			
		System.out.println(fgds);
		System.out.println(axing);
		System.out.println(me);
		System.out.println(dipai);
		
	}
}
