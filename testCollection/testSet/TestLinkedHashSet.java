package cn.ttw.testCollection.testSet;

/**
 * LinkedHashSet�ײ�������ʵ�ֵģ���set������Ψһһ���ܱ�֤��ȡ˳��ļ��϶���
 * ��HashSet�����࣬Ҳ��֤Ԫ��Ψһ����HashSetԭ��һ��
 */

import java.util.LinkedHashSet;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("a");
		lhs.add("b");
		lhs.add("c");
		lhs.add("d");
		lhs.add("a");
		lhs.add("b");
		lhs.add("c");
		lhs.add("d");
		System.out.println(lhs);
		
		
		
	}
}
