package cn.ttw.testCollection.collection;


import java.util.ArrayList;

/**
 * Arrays�������е�asList������ʹ��
 *	����ת��Ϊ������Ȼ�������ӻ����Ԫ�أ����ǿ����ü��ϵ�˼��������飬�ȿ���ʹ�ü����е���������
 */


import java.util.Arrays;
import java.util.List;

public class AsList {

	public static void main(String[] args) {
		//test1();
		//test2();
		//test3();
		
		
	}

	public static void test3() {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		String[] s = list.toArray(new String[1]);	//������ת��Ϊ����ʱ�������鳤��<=���ϵ�sizeʱ��ת��������鳤�ȵ��ڼ��ϵ�size
													//�����鳤��<=���ϵ�size,��������鳤�Ⱥ��ƶ��ĳ���һ��
		for (String string : s) {
			System.out.println(string);
		}
	}

	public static void test2() {
		//		int[] a = {11,22,33,44,55};
		//		List list = Arrays.asList(a);	//�����������͵�����ת��Ϊ���ϣ��Ὣ�������鵱��һ������
		//		System.out.println(list);
				
				Integer[] arr = {11,22,33,44,55};
				List<Integer> list = Arrays.asList(arr);	//������ת��Ϊ���ϣ����������������������
				System.out.println(list);
	}

	public static void test1() {
		String[] s = {"a","b","c"};
		List<String> list = Arrays.asList(s);		//����ת��Ϊ����
		//list.add("d");
		System.out.println(list);
	}
}
