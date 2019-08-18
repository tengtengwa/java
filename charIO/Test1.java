package cn.ttw.charIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 将上一个文本中的内容反转，将第一行和倒数第一行交换，将第二行和倒数第二行交换
 *
 *	步骤：
 *	1.创建输入输出对象
 *	2.创建集合对象
 *	3.将读到的数据储存在集合中
 *	4.倒着遍历集合，将数据写入文件
 *	5.关流
 *
 *	注意事项：流对象尽量晚开早关
 */

public class Test1 {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new FileReader("xxx.txt"));
    	ArrayList<String> list = new ArrayList<String>();
    	String line;
    	while((line = br.readLine()) != null) {
    		list.add(line);
    	}
    	
    	br.close();
    	BufferedWriter bw = new BufferedWriter(new FileWriter("yyy.txt"));
    	for(int i = list.size()-1; i >= 0; i--) {
    		bw.write(list.get(i));
    		bw.newLine();
    	}
    	bw.close();
    	
    	
    }
}
