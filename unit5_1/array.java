package cn.ttw.unit5_1;

public class array {


	
	public static void main(String[] args) {
		int[] a = new int[10];
		String[] s = new String[5];
		Users[] arr = new Users[5];
		//静态初始化
		int[] b = {1,2,3,4,5};
		//动态初始化
		a[0]=6;
		a[1]=5;
		
		for(int i=0;i<a.length;i++)
			a[i]=i;
		
		//foreach循环：读取(打印)数组元素的值，不能修改元素的值
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
