package cn.ttw.testCollection.testMap;

import java.util.LinkedHashMap;

public class TestLinkedHashMap {

	public static void main(String[] args) {
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put("zs", 23);
		lhm.put("ls", 24);
		lhm.put("ww", 25);
		lhm.put("zl", 26);
		
		System.out.println(lhm);
		
	}
}
