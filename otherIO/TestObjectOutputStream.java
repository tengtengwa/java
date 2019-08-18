package cn.ttw.otherIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * 序列化：将对象写到文件上
 *
 */

public class TestObjectOutputStream {
    public static void main(String[] args) throws IOException {
        //test1();

        Person p1 = new Person("zs",23);
        Person p2 = new Person("ls",24);
        Person p3 = new Person("ww",25);
        Person p4 = new Person("zl",26);

        ArrayList<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("xxx.txt"));   //将集合对象一次写出
        oos.writeObject(list);
        oos.close();

    }

    private static void test1() throws IOException {
        Person p1 = new Person("zs",23);
        Person p2 = new Person("ls",24);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("xxx.txt"));
        oos.writeObject(p1);
        oos.writeObject(p2);

        oos.close();
    }
}
