package cn.ttw.otherIO;
import java.io.*;
import java.io.ByteArrayOutputStream;

import java.io.FileInputStream;

/**
 * 内存输出流
 *
 */

public class TestByteArrayOutputStream {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("ooo.txt");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();       //在内存中创建了可以增长的内存数组
        int b;
        while ((b = fis.read()) != -1){
            baos.write(b);                       //将读取到的数据全部写入内存
        }

//        byte[] arr = baos.toByteArray();        //将缓冲区的数据全部获取出来，并赋值给arr
//        System.out.println(new String(arr));

        System.out.println(baos);       //将缓冲区的内容转换为字符串，在输出语句中可以省略调用toString方法
        fis.close();

    }
}
