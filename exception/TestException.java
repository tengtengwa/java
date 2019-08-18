package cn.ttw.exception;

/**
 * 异常处理的两种方式：
 *    1.try...catch...finally
 *    	try catch
 *    	try catch finally
 *    	try finally
 *    	原则：如果该功能内部可以将问题处理就用try
 *  	区别：后续程序需要继续运行就try
 *    2.throws
 *    	如果处理不了则交给调用者处理，这时用throws
 * 		后续程序不需要继续运行就用throws
 *    
 *    try:用来检测异常
 *    catch:捕获异常
 *    finally:释放资源
 * 
 * 
 *
 * 
 *异常注意事项
 * 	1.子类重写父类方法时，子类的方法必须抛出相同的异常或父类异常的子类
 * 	2.如果父类抛出多个异常，子类重写父类时，只能抛出相同的异常或它的子集，父类不能抛出父类没有的异常
 * 	3.如果被重写的方法没有异常抛出，那么子类的方法绝对不可以抛出异常，如果子类方法内有异常发生，那么子类只能try，不能throws
 */


public class TestException {

	public static void main(String[] args) {
		//Test1();
		
		int[] arr = {11,22,33,44,55};
		int a = 10;
		int b = 0;
		try {											//通过try catch将问题处理后，程序会继续执行
			System.out.println(a/b);
			System.out.println(arr[10]);
			arr = null;
			System.out.println(arr[0]);
			
		}catch(ArithmeticException e) {		//try后面如果跟多个catch，那么小的异常放在前面，大的异常放在后面，根据多态的原理，会将所有的子类对象接受，则后面的catch就没有意义了
			System.out.println("出错了，除数为零!");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("索引越界");
		}catch(Exception e) {						//Exception e = new NullPointerException
			System.out.println("出错了");
		}
		
		System.out.println(666666);
		
		
	}

	public static void test1() {
		int[] arr = {11,22,33,44,55};
		//arr = null;
		System.out.println(arr[10]);
	}
}

