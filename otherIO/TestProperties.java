package cn.ttw.otherIO;

import java.util.Enumeration;
import java.util.Properties;

public class TestProperties {
    public static void main(String[] args) {
        //test1();

        Properties prop = new Properties();
        prop.setProperty("name","zs");
        prop.setProperty("tel","666");

        //System.out.println(prop);
        Enumeration<String> en = (Enumeration<String>) prop.propertyNames();
        while (en.hasMoreElements()){
            String key = en.nextElement();      //获取properties中的每一个键
            String value = prop.getProperty(key);
            System.out.println(key + "=" + value);
        }

    }

    private static void test1() {
        Properties prop = new Properties();
        prop.put("abc",123);
        System.out.println(prop);
    }
}
