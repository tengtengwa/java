package cn.ttw.otherIO;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * ����һ���ļ�������������read(byte[] b)��������ooo.txt�ļ��е����ݴ�ӡ����(byte�����С����Ϊ5)
 *
 *
 */

public class Test1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("ooo.txt");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] arr = new byte[5];
        int len;
        while((len = fis.read(arr)) != -1){
            //System.out.write(new String(arr,0,len));
            baos.write(arr,0,len);
        }
        System.out.println(baos);
        fis.close();

    }
}
