package cn.ttw.exception;

/**
 * �쳣��������ַ�ʽ��
 *    1.try...catch...finally
 *    	try catch
 *    	try catch finally
 *    	try finally
 *    	ԭ������ù����ڲ����Խ����⴦�����try
 *  	���𣺺���������Ҫ�������о�try
 *    2.throws
 *    	����������򽻸������ߴ�����ʱ��throws
 * 		����������Ҫ�������о���throws
 *    
 *    try:��������쳣
 *    catch:�����쳣
 *    finally:�ͷ���Դ
 * 
 * 
 *
 * 
 *�쳣ע������
 * 	1.������д���෽��ʱ������ķ��������׳���ͬ���쳣�����쳣������
 * 	2.��������׳�����쳣��������д����ʱ��ֻ���׳���ͬ���쳣�������Ӽ������಻���׳�����û�е��쳣
 * 	3.�������д�ķ���û���쳣�׳�����ô����ķ������Բ������׳��쳣��������෽�������쳣��������ô����ֻ��try������throws
 */


public class TestException {

	public static void main(String[] args) {
		//Test1();
		
		int[] arr = {11,22,33,44,55};
		int a = 10;
		int b = 0;
		try {											//ͨ��try catch�����⴦��󣬳�������ִ��
			System.out.println(a/b);
			System.out.println(arr[10]);
			arr = null;
			System.out.println(arr[0]);
			
		}catch(ArithmeticException e) {		//try������������catch����ôС���쳣����ǰ�棬����쳣���ں��棬���ݶ�̬��ԭ���Ὣ���е����������ܣ�������catch��û��������
			System.out.println("�����ˣ�����Ϊ��!");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("����Խ��");
		}catch(Exception e) {						//Exception e = new NullPointerException
			System.out.println("������");
		}
		
		System.out.println(666666);
		
		
	}

	public static void test1() {
		int[] arr = {11,22,33,44,55};
		//arr = null;
		System.out.println(arr[10]);
	}
}

