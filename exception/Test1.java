package cn.ttw.exception;

/**
 *	final,finally,finalize的区别：
 * 		final：可以修饰类，不能被继承； 修饰方法，不能被重写； 修饰变量，只能复制一次；
 * 		finally：try语句中的一个语句体，不能单独使用，用来释放资源
 * 		finalize：当垃圾回收器确定不存在对该对象的更多引用时，由对象的垃圾回收器调用此方法
 * 	
 *	如果catch里面有return语句，那么finally的代码还会执行吗？如果会，请问是在return前还是return后
 * 		还会执行；在return彻底返回前
 * 
 */

public class Test1 {

	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println(d.method());
	}
}

class Demo{
	public int method() {
		int x = 10;
		try {
			x = 20;
			System.out.println(1/0);
			return x;
		}catch(Exception e) {
			x = 30;
			return x;			
		}finally {
			x = 40;
			//return x;		//不要在finally语句中写返回语句
		}

		
	}
	
}