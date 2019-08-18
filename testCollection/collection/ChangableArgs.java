package cn.ttw.testCollection.collection;

/**
 * 
 * 	可变参数：
 * 		格式：修饰符 返回值类型 方法名(数据类型...  变量名) {}
 *		注意事项：1.这里的变量是一个数组		2.一个方法有可变参数，且有多个参数，则可变参数肯定是最后一个
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
