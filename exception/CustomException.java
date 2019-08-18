package cn.ttw.exception;

/**
 * 	为什么需要自定义异常：
 * 		通过名字区分到底是什么异常，有针对的解决异常
 * 
 * 	自定义异常概述：继承Exception或RunTimeException
 * 
 */

public class CustomException {

	public static void main(String[] args) {
		
	}
}

class AgeOutOfBoundsException extends Exception {

	public AgeOutOfBoundsException() {
		super();
		
	}

	public AgeOutOfBoundsException(String message) {
		super(message);
		
	}
	
}