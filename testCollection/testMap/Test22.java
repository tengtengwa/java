package cn.ttw.testCollection.testMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * 模拟斗地主洗牌和发牌
 * 1.创建集合对象，将扑克牌存入
 * 2.洗牌
 * 3.发牌
 * 4.看牌
 * 
 */


public class Test22 {

	public static void main(String[] args) {
		String[] num = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
		String[] color = {"黑桃","红桃","方片","梅花"};
		HashMap<Integer, String> hm = new HashMap<>();		//储存索引和扑克牌
		ArrayList<Integer> list = new ArrayList<>();		//储存索引
		int index = 0;
		
		for(String s1 : num) {
			for(String s2 : color) {
				hm.put(index, s2.concat(s1));
				list.add(index++);
			}
		}
		hm.put(index, "小王");
		list.add(index++);
		hm.put(index, "大王");
		list.add(index);
		//洗牌
		Collections.shuffle(list);
		//发牌
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
		//看牌
		lookPoker(hm, fgds, "fgds");
		lookPoker(hm, axing, "axing");
		lookPoker(hm, ttw, "ttw");
		lookPoker(hm, dipai, "dipai");
	}
	
	
	public static void lookPoker(HashMap<Integer,String> hm, TreeSet<Integer> ts, String name) {
		System.out.println(name + "的牌是：");
		for(Integer i : ts)	{
			System.out.print(hm.get(i) + " ");
		}
		System.out.println();
	}
	
	
	
	
	
}
