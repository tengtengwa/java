package cn.ttw.testCollection.testSet;

import java.util.HashSet;
import java.util.Random;

/**
 * ���󣺱�дһ�����򣬻�ȡ10��1��20���������Ҫ������������ظ����������յ���������������̨
 * 
 *
 */

public class Test1 {
	public static void main(String[] args) {
		Random rom = new Random();
		HashSet<Integer> hs = new HashSet<>();
		
		while(hs.size()<10) {
			hs.add(rom.nextInt(20)+1);
		}
		for (Integer integer : hs) {
			System.out.println(integer);
		}
	}
}
