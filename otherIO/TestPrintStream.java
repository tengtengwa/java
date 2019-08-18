package cn.ttw.otherIO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * PrintStream和PrintWriter分别打印的是字节流和字符流
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
        PrintStream ps = System.out;    //获取输出流
        ps.println(97);                 //底层通过Integer.toString()将97转换为字符串并打印
        ps.write(97);               //查找码表，找到对应的a并打印

        Person p1 = new Person("zs",23);
        ps.println(p1);         //默认调用p1的toString方法

        Person p2 = null;       //打印引用数据类型，如果是null就打印null，否则打印对象的toString方法
        ps.println(p2);
        ps.close();
    }
}
