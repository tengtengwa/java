package cn.ttw.testCollection.testSet;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * 从键盘中接受多个整数，直到输入quit时结束输入，把所有的整数倒序排列打印
 * 
 */


public class Test6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		TreeSet<Integer> ts = new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer i1, Integer i2) {
				//int num = i2 - i1;					//自动装箱		i1-i2是正序，i2-i1是倒序
				int num = i2.compareTo(i1);
				return num == 0 ? -1 : num;		//num==0时两数相等，此时返回正负数对排序没有影响；num!=0时数的顺序和被减数和减数的顺序有关
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
