package cn.ttw.testCollection.mycollection;

/**
 * �Զ�������ʵ����ɾ���
 * @author �����޷���İ�ש
 *
 */

public class MyLinkedList<E> {
	private Node first;
	private Node last;
	private int size;
	
	public void add(int index,E elememt) {		//����ڵ㣨��ʱ����������Ԫ�أ�
		checkRange(index);
		
		Node newNode = new Node(elememt);
		Node tem = getNode(index);
		
		if(tem!=null) {
			Node up = tem.previous;
			
			up.next = newNode;
			newNode.previous = up;
			
			newNode.next = tem;
			tem.previous = newNode;
		}
	}
	
	
	
	
	public void remove(int index) {
		checkRange(index);
		
		Node tem = getNode(index);
		
		if(tem!=null) {
			Node up = tem.previous;
			Node down = tem.next;
			
			if(up!=null) {
				up.next = down;
			}
			if(down!=null) {
				down.previous = up;
			}
			if(index==0) {
				first = down;
			}
			if(index==size-1) {
				last = up;
			}
			
			size--;
		}
	}
	
	
	
	
	public E get(int index) {			//��
		checkRange(index);
		
		Node tem = getNode(index);
		return tem != null ? (E)tem.element : null;
	}
	
	private void checkRange(int index) {
		if(index<0 || index>=size) {
			throw new RuntimeException("�������ֲ��Ϸ�"+index);
		}
	}
	
	private Node getNode(int index) {
		checkRange(index);
		
		Node tem = first;
		
		if(index <= (size>>1)) {		//����С�ڵ���Ԫ�ظ�����һ��ʱ����ǰ�������
			for(int i=0;i<index;i++) {
				tem = tem.next;
			}
		}else {							//�������ڵ���Ԫ�ظ�����һ��ʱ���Ӻ���ǰ����
			tem = last;
			for(int i=size-1;i>index;i--) {
				tem = tem.previous;
			}
		}
		return tem;
	}
	
	
	
	public void add(E element) {		//��
		Node node = new Node(element);
		
		if(first==null) {		//������û��Ԫ��
			
			first = node;
			last = node;
		}else {					//����������Ԫ�أ����½ڵ��������ĩβ
			node.previous = last;
			node.next = null;
			
			last.next = node;
			last = node;
		}
		size++;
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder("[");
		Node tem = first;
		
		while(tem!=null) {
			sb.append(tem.element+",");
			tem = tem.next;
		}
		sb.setCharAt(sb.length()-1, ']');
		
		return sb.toString();
	}
	
	
	
	
	
	public static void main(String[] args) {
		MyLinkedList <String> list = new MyLinkedList();
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		list.add("g");
		
		System.out.println(list);
		list.add(1, "ttw");
		System.out.println(list);
		System.out.println(list.get(2));
	}
	
	
}
