package cn.ttw.otherIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * �����������������л�
 */


public class TestObjectInputStream {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        //test1();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("xxx.txt"));  //�ļ��б����Ѿ�д��������ݲ���������ȡ
        ArrayList<Person> list = (ArrayList<Person>) ois.readObject();      //�����϶���һ�ζ�ȡ

        for (Person person : list
             ) {
            System.out.println(person);
        }

    }

    private static void test1() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("xxx.txt"));

        Person p1 = (Person) ois.readObject();
        Person p2 = (Person) ois.readObject();
        //Person p3 = (Person) ois.readObject();        //EOFException�ļ���ȡ��ĩβʱ����EOFException

        System.out.println(p1);
        System.out.println(p2);

        ois.close();
    }

}
