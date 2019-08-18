package cn.ttw.unit5_1;

/**
 * ���Զ�̬
 * @author �����޷���İ�ש
 * 
 * ��̬�������������̳У�������д���෽������������ָ���������
 *
 */

public class TestPolym {
	public static void main(String[] args) {
		
		Animal d = new Dog();		//�Զ�����ת��(����תΪ�������)
		animalCry(d);
		
		Animal c = new Cat();
		animalCry(new Cat());
		
		Dog d2 = (Dog) d;			//ǿ������ת��(�������ǿ��תΪ�������)
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
		System.out.println("����һ��");
	}
}

class Dog extends Animal{
	public void shout() {
		System.out.println("������");
	}
	
	public void seeDoor() {
		System.out.println("������");
	}
}

class Cat extends Animal{
	public void shout() {
		System.out.println("��������");
	}
}




