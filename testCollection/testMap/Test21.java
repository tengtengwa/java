package cn.ttw.testCollection.testMap;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 模拟斗地主洗牌和发牌
 * 1.创建集合对象，将扑克牌存入
 * 2.洗牌
 * 3.发牌
 * 4.看牌
 * 
 */


public class Test21 {

	public static void main(String[] args) {
		String[] num = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
		String[] color = {"黑桃","红桃","方片","梅花"};

		ArrayList<String> poker = new ArrayList<>();
		
		for(String s1 : color) {
			for(String s2 : num) {
				poker.add(s1.concat(s2));
			}
		}

		poker.add("大王");
		poker.add("小王");
		Collections.shuffle(poker);
		System.out.println(poker);
		
		ArrayList<String> fgds = new ArrayList<String>();
		ArrayList<String> me = new ArrayList<String>();
		ArrayList<String> axing = new ArrayList<String>();
		ArrayList<String> dipai = new ArrayList<String>();
		
		for(int i=0;i<poker.size();i++) {
			if(i>=poker.size()-3) {				//最后三张作为底牌
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
