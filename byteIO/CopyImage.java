package cn.ttw.byteIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImage {

	public static void main(String[] args) throws IOException {
		//Test1();
		//test2();
		
		//test3();
		//定义小数组的标准格式
		FileInputStream fis = new FileInputStream("C:\\Users\\腾腾娃发光的板砖\\Desktop\\文件夹\\test.txt");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\腾腾娃发光的板砖\\Desktop\\copy.txt");
		
		byte[] arr = new byte[1024 * 8];
		int len;
		while((len = fis.read(arr)) != -1) {		//如果忘记给read方法传入参数（数组名），返回的就不是读取的字节个数，而是字节的码表值
			fos.write(arr, 0, len);
		}

		fis.close();
		fos.close();
		
		
		
		
		
		
		
	}

	public static void test3() throws FileNotFoundException, IOException {
		/**
		 *	第三种拷贝方式
		 *	定义小数组
		 */
		FileInputStream fis = new FileInputStream("C:\\Users\\腾腾娃发光的板砖\\Desktop\\文件夹\\test.txt");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\腾腾娃发光的板砖\\Desktop\\copy.txt");
		
		byte[] arr = new byte[2];
		int len;
		while((len = fis.read(arr)) != -1) {
			fos.write(arr, 0, len);				//???
		}

		fis.close();
		fos.close();
	}

	public static void test2() throws FileNotFoundException, IOException {
		//方法二： 不推荐，有可能导致内存溢出
		FileInputStream fis = new FileInputStream("C:\\Users\\腾腾娃发光的板砖\\Desktop\\文件夹\\XMD.zip");	//创建输入流对象
		FileOutputStream fos = new FileOutputStream("C:\\Users\\腾腾娃发光的板砖\\Desktop\\copy.zip");
//		int len = fis.available();
//		System.out.println(len);
		
		byte[] arr = new byte[fis.available()];		//创建和文件大小一样的字节数组
		fis.read(arr);								//将文件中的字节读入内存，返回读到的有效的字节个数
		fos.write(arr);								//将文件中的字节写入文件
		
		
		fis.close();
		fos.close();
	}

	//方法一：音频，图片读取写入（不推荐，效率很低）
	public static void test1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\腾腾娃发光的板砖\\Desktop\\风景\\1.jpg");	//创建输入流对象
		FileOutputStream fos = new FileOutputStream("C:\\Users\\腾腾娃发光的板砖\\Desktop\\风景\\copy.jpg");
		
		int b;
		while((b = fis.read()) != -1) {		//不断读取每个字节
			fos.write(b);					//写出每个字节
		}
		fis.close();
		fos.close();
	}
}
