package cn.ttw.testCollection.collection;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class TestGeneric2 {

	public static void main(String[] args)  {
		
		List<Integer> list = new ArrayList<>();		//�ұ߷��Ͳ�ȷ��ʱ����߿���ָ��Ϊ?
		list.add(1);
		
		try {
			Class c = Class.forName("java.util.ArrayList");
			Method m = c.getMethod("add", Object.class);
			m.invoke(list, "teng");
			System.out.print(list);
		}catch(Exception e){
			e.printStackTrace();
		}		
	}
}
