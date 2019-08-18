package cn.ttw.unit7;

public class TestString2 {
	public static void main(String[] args) {
		//demo1();
		//demo2();
		
		String s1 = "xiyou";
		String s2 = "";			//""是字符串常量，同时是一个String类对象，是对象既可以调用String类中的方法
		String s3 = null;		//null是空常量，不能调用任何方法，否则出现空指针异常，null常量可以给任意引用数据类型赋值
		
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
		//System.out.println(s3.isEmpty());		//空指针异常
		
	}

	private static void demo2() {
		String s1 = "我是腾腾娃";
		String s2 = "腾腾娃";
		String s3 = "腾腾儿娃";
		String s4 = "我是";
		String s5 = "娃";
		
		System.out.println(s1.contains(s2));		//判断是否包含传入的字符串
		System.out.println(s1.contains(s3));
		
		System.out.println(s1.startsWith(s4));
		System.out.println(s1.startsWith(s5));
		
		System.out.println(s1.endsWith(s5));
		System.out.println(s1.endsWith(s2));
	}
	
	
	
	
	
	
	
	private static void demo1() {
		
		String s1 = "ttw";
		String s2 = "ttw";
		String s3 = "TTw";
		
		System.out.println(s1.equals(s2));	//equals方法区分大小写
		System.out.println(s2.equals(s3));
		
		System.out.println("-------------------");
		
		System.out.println(s1.equalsIgnoreCase(s2));	//equalsIgnoreCase方法不区分大小写
		System.out.println(s1.equalsIgnoreCase(s3));		
	}
	
}


