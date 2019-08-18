package cn.ttw.exception;

/**
 * 	finally的特点
 * 		被finally控制的语句体一定会执行
 * 		特殊情况：在执行到finally前jvm退出了（如System.exit(0)）
 * 	finally的作用：
 * 		用于释放资源，在IO流操作和数据库操作中会见到
 * 	return语句执行后会看一看有没有finally语句，如果有就将finally执行后再彻底返回
 * 
 */

public class TestFinally {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}catch(Exception e) {
			System.out.println("除数为零了");
			System.exit(0);			//退出jvm虚拟机
			return;
		}finally {
			System.out.println("看我执行了么");
		}
		
		
	}
}
