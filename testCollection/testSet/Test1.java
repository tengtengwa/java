package cn.ttw.testCollection.testSet;

import java.util.HashSet;
import java.util.Random;

/**
 * 需求：编写一个程序，获取10个1到20的随机数，要求随机数不能重复，并把最终的随机数输出到控制台
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
