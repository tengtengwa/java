package cn.ttw.byteIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * 将键盘录入的数据拷贝到桌面的text.txt文件中，当键盘录入quit时退出
 * 
 * 步骤：
 * 	1.创建键盘录入对象
 * 	2.创建输出流对象，关联test.txt文件
 * 	3.定义无限循环
 * 	4.遇到quit时退出
 * 	5.如不quit，就将内容写入
 * 	6.关闭流
 * 
 * 
 * 
 */

public class Test3 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos = new FileOutputStream("C:\\Users\\腾腾娃发光的板砖\\Desktop\\text.txt");
		while(true) {
			String line = sc.nextLine();
			if("quit".equals(line)) {
				break;
			}else {
				fos.write(line.getBytes());
				fos.write("\r\n".getBytes());	//Java中windows系统中换行需要\r\n
			}
		}
		fos.close();
		
		
		
		
		
		
	}
}
