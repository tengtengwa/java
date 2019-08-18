package cn.ttw.thread;

/**
 * �������ģʽ
 */

/**
 * ����ʽ������ʽ������
 * 1.����ʽ�ǿռ任ʱ�䣬����ʽ��ʱ�任�ռ�
 * 2.�ڶ��̷߳���ʱ������ʽ���ᴴ��������󣬶�����ʽ�п��ܴ����������
 *
 */

public class TestSingleton {
    public static void main(String[] args) {
//        Singleton s1 = new Singleton();
//          Singleton s1 = Singleton.s;           //��Ա������˽�У�����ͨ������.����
//          Singleton.s = null;
//          Singleton s2 = Singleton.s;
//
//        System.out.println(s1 == s2);

        Singleton s1 = Singleton.s;
        Singleton s2 = Singleton.s;
        System.out.println(s1 == s2);

    }
}

/**
 * ����ʽ


class Singleton {
    //1.˽�й��췽���������಻�ܷ��ʸù��췽��
    private Singleton() {}
    //2.�����������
    private static Singleton s = new Singleton();
    //3.�����ṩ�������ʷ���
    public static Singleton getS() {
        return s;
    }

}
*/

/**
 * ����ʽ,�������ӳټ���ģʽ


class Singleton {
    //1.˽�й��췽���������಻�ܷ��ʸù��췽��
    private Singleton() {}
    //2.�����������
    private static Singleton s;
    //3.�����ṩ�������ʷ���
    public static Singleton getS() {
        if(s == null) {
            s = new Singleton();
        }

        return s;
    }

}

 */



class Singleton {
    //1.˽�й��췽���������಻�ܷ��ʸù��췽��
    private Singleton() {}
    //2.�����������
    public static final Singleton s = new Singleton();

}
