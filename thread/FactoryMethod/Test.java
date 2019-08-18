package cn.ttw.thread.FactoryMethod;

public class Test {
    public static void main(String[] args) {
        DogFactory df = new DogFactory();
        Dog d = (Dog) df.createAnimal();
        d.eat();

    }
}
