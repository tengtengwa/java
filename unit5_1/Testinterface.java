package cn.ttw.unit5_1;

public interface Testinterface {

	int SUM=250;
	void funtion();
	
	public static void main(String[] args) {
		
		Angel a = new Angel();
		a.fly();
		
	}
	
}

class solution implements Testinterface{

	@Override
	public void funtion() {
		// TODO Auto-generated method stub
		System.out.println(SUM);
		
	}
}

interface Volant{
	int FLY_HEIGHT=666;
	void fly();
}

interface Honest{
	void helpOthers();
}

class Angel implements Volant,Honest{

	@Override
	public void helpOthers() {
		System.out.println("I am pleased to help you\n");
	}

	@Override
	public void fly() {
		System.out.println("That's so fast\n");
		
	}
	
	
}
