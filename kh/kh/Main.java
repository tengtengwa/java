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
        //�Ե�ǰPerson�����еķ���������д,��Ҫ���бȽϵ�object������ǿ��ת��ΪPerson����
        Person stu = (Person) obj;
        //��ǰ�����е�ָ�����ԺͲ��������е�ָ�� ����ֵ���бȽ�

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
        Person p1 = new Person("С��", 16);
        Person p2 = new Person("С��", 16);
        Person p3 = new Person("С��", 16);
        Person p4 = new Person("С��", 16);
        map.put(p1, 1);
        map.put(p2, 1);
        map.put(p3, 1);
        map.put(p4, 1);
        //����Ӻ��ʵ����ݣ�ʹmap����������(С����16)����Ϊ��ͬһ��
        //������������ͬ��Person��HashMap��Ϊ��ͬһ��
        System.out.println(map.size());
    }
}

