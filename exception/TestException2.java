package cn.ttw.exception;

/**
 * Java中异常分为两大类：编译时异常和运行时异常
 * 	编译时异常：必须显示处理否则程序发生错误，无法通过编译
 * 	运行时异常：无需显示处理也可以和编译时异常一样处理
 * 
 * 
 */

import java.io.FileInputStream;

public class TestException2 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("xxx.txt");			
		}catch(Exception e) {
			
		}
		

		
		
		
	}
}
