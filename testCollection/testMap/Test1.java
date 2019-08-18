package cn.ttw.testCollection.testMap;

import java.util.HashMap;

/**
 * 需求：统计字符串中每个字符出现的次数
 * 
 */

public class Test1 {
	public static void main(String[] args) {
		//定义字符串
		String s = "aaaabbbbbcccccctcccctccccwccc";
		//2.转换为字符数组
		char[] arr = s.toCharArray();
		//3.定义双列集合，储存字符串中的字符和字符出现次数
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		//4.储存前判断集合中是否有这个键，有则把出现次数置为1，否则将出现次数加1
		for(char c : arr) {
				hm.put(c, !hm.containsKey(c) ? 1 : hm.get(c)+1);
			}
		//5.便利打印
		for(Character key : hm.keySet()) {
			System.out.println(key+"="+hm.get(key));
		}
		
	}
}
