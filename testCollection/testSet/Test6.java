package cn.ttw.testCollection.testSet;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * �Ӽ����н��ܶ��������ֱ������quitʱ�������룬�����е������������д�ӡ
 * 
 */


public class Test6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		TreeSet<Integer> ts = new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer i1, Integer i2) {
				//int num = i2 - i1;					//�Զ�װ��		i1-i2������i2-i1�ǵ���
				int num = i2.compareTo(i1);
				return num == 0 ? -1 : num;		//num==0ʱ������ȣ���ʱ����������������û��Ӱ�죻num!=0ʱ����˳��ͱ������ͼ�����˳���й�
			}
			
		});
		
		
		while(true) {
			String line = sc.nextLine();
			if("quit".equals(line)) {
				break;
			}else {
				Integer i = Integer.parseInt(line);
				
				ts.add(i);
			}
		}
		
		System.out.println(ts);
	}
}
