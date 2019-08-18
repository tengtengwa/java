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

	public <T> void show(T t) {			//����������ú���ķ���һ�£������һ�£���Ҫ�ڷ����������÷���
		System.out.println(t);
	}
	
	public static<W> void print(W w) {		//��̬�������������Լ��ķ���
		System.out.println(w);
	}
	
	
}
