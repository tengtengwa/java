package cn.ttw.exception;

/**
 * 	Ϊʲô��Ҫ�Զ����쳣��
 * 		ͨ���������ֵ�����ʲô�쳣������ԵĽ���쳣
 * 
 * 	�Զ����쳣�������̳�Exception��RunTimeException
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