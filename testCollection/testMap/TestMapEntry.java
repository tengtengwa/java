package cn.ttw.testCollection.testMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class TestMapEntry {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("װ��", 23);
		map.put("����", 23);
		map.put("����", 23);
		map.put("����", 23);
		
		//Map.Entry˵��Entry��Map���ڲ��ӿڣ�������ֵ��װ����Entry���󣬲�������Set������
		Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String,Integer>> it = entrySet.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry);
		}
		
		
	}
}
