package cn.ttw.unit5_1;

public class array {


	
	public static void main(String[] args) {
		int[] a = new int[10];
		String[] s = new String[5];
		Users[] arr = new Users[5];
		//��̬��ʼ��
		int[] b = {1,2,3,4,5};
		//��̬��ʼ��
		a[0]=6;
		a[1]=5;
		
		for(int i=0;i<a.length;i++)
			a[i]=i;
		
		//foreachѭ������ȡ(��ӡ)����Ԫ�ص�ֵ�������޸�Ԫ�ص�ֵ
		for(int m:a) {
			System.out.println(m);
		}
		
		String[] ss = {"001","aaa","002"};
		for(String t:ss) {
			System.out.println(t);
		}
		
		
		
		
	}
	
}

class Users{
	private int num;
	
}
