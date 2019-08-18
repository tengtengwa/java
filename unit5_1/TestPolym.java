package cn.ttw.unit5_1;

/**
 * 测试多态
 * @author 腾腾娃发光的板砖
 * 
 * 多态的三个条件：继承，子类重写父类方法，父类引用指向子类对象
 *
 */

public class TestPolym {
	public static void main(String[] args) {
		
		Animal d = new Dog();		//自动向上转型(子类转为父类对象)
		animalCry(d);
		
		Animal c = new Cat();
		animalCry(new Cat());
		
		Dog d2 = (Dog) d;			//强制向下转型(父类对象强制转为子类对象)
		d2.seeDoor();
		
		//Dog d3 = (Dog)c;
		//d3.seeDoor();
	}
	
	static void animalCry(Animal a) {
		a.shout();
	}
	
}

class Animal{
	public void shout() {
		System.out.println("叫了一声");
	}
}

class Dog extends Animal{
	public void shout() {
		System.out.println("汪汪汪");
	}
	
	public void seeDoor() {
		System.out.println("看门中");
	}
}

class Cat extends Animal{
	public void shout() {
		System.out.println("喵喵喵喵");
	}
}




