package cn.ttw.thread.SimpleFactory;

/**
 * 工厂模式：又叫静态工厂方法模式，它定义一个具体的工厂类负责创建一些类的实例
 * 优点：
 *      客户端不需要再负责对象的创建，从而明确了各个类的职责
 * 缺点：
 *      这个静态工厂类负责所有对象的创建，如果有新的对象的增加，或者某些对象的创建方式不同，就需要不断修改工厂类，不利于后期维护
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
