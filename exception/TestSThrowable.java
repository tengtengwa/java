package cn.ttw.exception;

public class TestSThrowable {

	public static void main(String[] args) {
		try {
			System.out.println(1/0);
			
		}catch(Exception e) {
			//System.out.println(e.getMessage());		//获取异常信息
			System.out.println(e);						//调用toString方法，打印异常类名和异常信息
			e.printStackTrace();						//jvm默认这种方式处理异常
		}
		
		
		
		
	}
}
