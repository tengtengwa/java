package cn.ttw.testCollection.collection;

/**
 * 
 * 	�ɱ������
 * 		��ʽ�����η� ����ֵ���� ������(��������...  ������) {}
 *		ע�����1.����ı�����һ������		2.һ�������пɱ���������ж����������ɱ�����϶������һ��
 */

public class ChangableArgs {

	public static void main(String[] args) {
		int[] a = {11,22,33,44,55};
		//print(a);
		System.out.println("-------------");
		print(11,22,33,44,55);
	}
	
	/*public static void print(int[] a) {
		for (int i : a) {
			System.out.println(i);
		}
	}*/
	
	public static void print(int x,int ... a) {
		for (int i : a) {
			System.out.println(i);
		}
	}
	
}
