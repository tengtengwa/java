package cn.ttw.otherIO;
import java.io.*;
import java.io.ByteArrayOutputStream;

import java.io.FileInputStream;

/**
 * �ڴ������
 *
 */

public class TestByteArrayOutputStream {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("ooo.txt");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();       //���ڴ��д����˿����������ڴ�����
        int b;
        while ((b = fis.read()) != -1){
            baos.write(b);                       //����ȡ��������ȫ��д���ڴ�
        }

//        byte[] arr = baos.toByteArray();        //��������������ȫ����ȡ����������ֵ��arr
//        System.out.println(new String(arr));

        System.out.println(baos);       //��������������ת��Ϊ�ַ��������������п���ʡ�Ե���toString����
        fis.close();

    }
}
