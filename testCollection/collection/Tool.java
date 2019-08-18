package cn.ttw.testCollection.collection;

public class Tool<E> {
	private E e;
	
	public Tool() {
		super();
	}	
	
	public Tool(E e) {
		super();
		this.e = e;
	}

	public E getE() {
		return e;
	}

	public void setE(E e) {
		this.e = e;
	}

	public <T> void show(T t) {			//方法泛型最好和类的泛型一致，如果不一致，需要在方法上声明该泛型
		System.out.println(t);
	}
	
	public static<W> void print(W w) {		//静态方法必须声明自己的泛型
		System.out.println(w);
	}
	
	
}
