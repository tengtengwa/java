package cn.ttw.thread.SimpleFactory;

public class Test {
    public static void main(String[] args) {
        Dog d = (Dog) AnimalFactory.createAnimal("dog");
        d.eat();

        Cat c = (Cat) AnimalFactory.createAnimal("cat");
        c.eat();


    }
}
