package cn.ttw.testCollection.testMap;

import java.util.HashMap;

/**
 * ����ͳ���ַ�����ÿ���ַ����ֵĴ���
 * 
 */

public class Test1 {
	public static void main(String[] args) {
		//�����ַ���
		String s = "aaaabbbbbcccccctcccctccccwccc";
		//2.ת��Ϊ�ַ�����
		char[] arr = s.toCharArray();
		//3.����˫�м��ϣ������ַ����е��ַ����ַ����ִ���
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		//4.����ǰ�жϼ������Ƿ��������������ѳ��ִ�����Ϊ1�����򽫳��ִ�����1
		for(char c : arr) {
				hm.put(c, !hm.containsKey(c) ? 1 : hm.get(c)+1);
			}
		//5.������ӡ
		for(Character key : hm.keySet()) {
			System.out.println(key+"="+hm.get(key));
		}
		
	}
}
