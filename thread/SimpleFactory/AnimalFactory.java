package cn.ttw.thread.SimpleFactory;

/**
 * ����ģʽ���ֽо�̬��������ģʽ��������һ������Ĺ����ฺ�𴴽�һЩ���ʵ��
 * �ŵ㣺
 *      �ͻ��˲���Ҫ�ٸ������Ĵ������Ӷ���ȷ�˸������ְ��
 * ȱ�㣺
 *      �����̬�����ฺ�����ж���Ĵ�����������µĶ�������ӣ�����ĳЩ����Ĵ�����ʽ��ͬ������Ҫ�����޸Ĺ����࣬�����ں���ά��
 *
 */

public class AnimalFactory {
    /*
    public static Dog createDog() {
        return new Dog();
    }

    public static Cat createCat() {
        return new Cat();
    }
    */

    public static Animal createAnimal(String name) {
        if("dog".equals(name)) {
            return new Dog();
        }else if("cat".equals(name)) {
            return new Cat();
        }else{
            return null;
        }
    }

}
