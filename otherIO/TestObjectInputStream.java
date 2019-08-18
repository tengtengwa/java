package cn.ttw.otherIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * 对象输入流，反序列化
 */


public class TestObjectInputStream {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        //test1();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("xxx.txt"));  //文件中必须已经写入对象数据才能正常读取
        ArrayList<Person> list = (ArrayList<Person>) ois.readObject();      //将集合对象一次读取

        for (Person person : list
             ) {
            System.out.println(person);
        }

    }

    private static void test1() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("xxx.txt"));

        Person p1 = (Person) ois.readObject();
        Person p2 = (Person) ois.readObject();
        //Person p3 = (Person) ois.readObject();        //EOFException文件读取到末尾时出现EOFException

        System.out.println(p1);
        System.out.println(p2);

        ois.close();
    }

}
