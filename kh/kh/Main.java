package cn.ttw.kh.kh;

import java.util.HashMap;
import java.util.Map;


class Main {

    private String name;
    private int age;
    private Person person;


    static class Person {
        String name;
        int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;

            if (this.name == name) {

            }
        }
    }

    @Override
    public boolean equals(Object obj) {
        //对当前Person对象当中的方法进行重写,将要进行比较的object对象先强制转变为Person对象
        Person stu = (Person) obj;
        //另当前对象当中的指定属性和参数对象当中的指定 属性值进行比较

        if (stu.age == this.age && stu.name.equals(this.name)) {
            return true;
        } else
            return false;
    }


        @Override
    public int hashCode() {
            if (hashCode(this.person) != null) {

            }

    }

    public static void main(String[] args) {
        Map<Person, Integer> map = new HashMap<>();
        Person p1 = new Person("小明", 16);
        Person p2 = new Person("小蓝", 16);
        Person p3 = new Person("小绿", 16);
        Person p4 = new Person("小蓝", 16);
        map.put(p1, 1);
        map.put(p2, 1);
        map.put(p3, 1);
        map.put(p4, 1);
        //请添加合适的内容，使map里放入的两个(小蓝，16)被认为是同一人
        //即姓名年龄相同的Person被HashMap认为是同一人
        System.out.println(map.size());
    }
}

