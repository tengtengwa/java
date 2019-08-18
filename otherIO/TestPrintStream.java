package cn.ttw.otherIO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * PrintStream��PrintWriter�ֱ��ӡ�����ֽ������ַ���
 *
 */


public class TestPrintStream {
    public static void main(String[] args) throws IOException {
        //test1();

        PrintWriter pw = new PrintWriter("yyy.txt");
        pw.println(97);
        pw.write(97);

        //pw.close();

    }

    private static void test1() {
        PrintStream ps = System.out;    //��ȡ�����
        ps.println(97);                 //�ײ�ͨ��Integer.toString()��97ת��Ϊ�ַ�������ӡ
        ps.write(97);               //��������ҵ���Ӧ��a����ӡ

        Person p1 = new Person("zs",23);
        ps.println(p1);         //Ĭ�ϵ���p1��toString����

        Person p2 = null;       //��ӡ�����������ͣ������null�ʹ�ӡnull�������ӡ�����toString����
        ps.println(p2);
        ps.close();
    }
}
