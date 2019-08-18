package cn.ttw.charIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 试用版软件：
 * 	每执行一次提醒我们还有多少次使用机会，试用10次机会，执行一次提示一次还剩几次机会，如果次数到了提示请购买正版
 * 分析：
 * 	1.创建带缓冲的输入流对象，因为要使用readline方法，可以保证数据不变
 * 	2.将读到的字符转换为int数
 * 	3.对int数进行判断，如果大于0就--并写回去，否则提示请购买正版
 * 	4.在if判断中要将--后的结果打印，并将结果通过输出流写到文件
 * 
 */


public class Test3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("config.txt"));
		String line = br.readLine();
		int times = Integer.parseInt(line);
		if(times > 0) {
			System.out.println("您还有" + times-- + "次机会");
			FileWriter fw = new FileWriter("config.txt");
			fw.write(times + "");
			fw.close();
		}else {
			System.out.println("伙计，你试用机会用完了，赶紧买正版");
		}
		
	}
}










