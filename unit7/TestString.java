package cn.ttw.unit7;

public class TestString {
	
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
		demo4();
		
}


	private static void demo1() {
	
		byte[] arr1 = {97,98,99};
		String s2 = new String(arr1);
		System.out.println(s2);
		
		byte[] arr2 = {97,98,99,100,101,102};
		String s3 = new String(arr2,2,3);			//将字节数组的一部分转化为字符串
		System.out.println(s3);
		
		char[] arr3 = {'a','b','c','d','e'};
		String s4 = new String(arr3);				//将字符数组转化为字符串
		System.out.println(s4);
		
		String s5 = new String(arr3,1,3);		
		System.out.println(s5);
	}

	private static void demo2() {
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");			//对内存中一个对象，常量池一个对象
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
		
	}
	
	private static void demo3() {
		String s1 = "a"+"b"+"c";
		String s2 = "abc";
		System.out.println(s1 == s2);				//Java中有常量优化机制，即在编译时优化为"abc"
		System.out.println(s1.equals(s2));
		
	}
	
	private static void demo4() {
		String s1 = "ab";
		String s2 = "abc";					//s2指向常量池
		String s3 = s1 + "c";				//通过StringBuffer转换为字符串，s3指向堆内存
		System.out.println(s3 == s2);
		System.out.println(s3.equals(s2));
		
	}

}



