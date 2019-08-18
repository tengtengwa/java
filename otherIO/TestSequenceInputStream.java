package cn.ttw.otherIO;
import	java.io.IOException;
import	java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import	java.util.Set;
import	java.io.FileInputStream;
import	java.util.Map;
import java.util.Vector;

public class TestSequenceInputStream {
    public static void main(String[] args) throws IOException {
        //test1();
        //test2();

        FileInputStream fis1 = new FileInputStream("xxx.txt");
        FileInputStream fis2 = new FileInputStream("yyy.txt");
        FileInputStream fis3 = new FileInputStream("zzz.txt");

        Vector<FileInputStream> v = new Vector<>();
        v.add(fis1);
        v.add(fis2);
        v.add(fis3);

        Enumeration<FileInputStream> en = v.elements();
        SequenceInputStream sis = new SequenceInputStream(en);
        FileOutputStream fos = new FileOutputStream("ooo.txt");

        int b;
        while ((b = sis.read()) != -1){
            fos.write(b);
        }
        sis.close();
        fos.close();

    }

    private static void test2() throws IOException {
        FileInputStream fis1 = new FileInputStream("xxx.txt");
        FileInputStream fis2 = new FileInputStream("yyy.txt");
        SequenceInputStream sis = new SequenceInputStream(fis1,fis2);
        FileOutputStream fos = new FileOutputStream("ooo.txt");

        int b;
        while ((b = sis.read()) != -1){
            fos.write(b);
        }
        sis.close();        //sis在关闭时会将构造方法中的流对象也都关闭
        fos.close();
    }

    private static void test1() throws IOException {
        FileInputStream fis1 = new FileInputStream("xxx.txt");
        FileOutputStream fos = new FileOutputStream("ooo.txt");

        int b1;

        while((b1 = fis1.read()) != -1){
            fos.write(b1);
        }
        fis1.close();

        FileInputStream fis2 = new FileInputStream("yyy.txt");
        int b2;
        while((b2 = fis2.read()) != -1){
            fos.write(b2);
        }
        fis2.close();
        fos.close();
    }
}
