package cn.ttw.testCollection.mycollection;

/**
 * 自定义链表实现增删插查
 * @author 腾腾娃发光的板砖
 *
 */

public class MyLinkedList<E> {
	private Node first;
	private Node last;
	private int size;
	
	public void add(int index,E elememt) {		//插入节点（此时链表中已有元素）
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
	
	
	
	
	public E get(int index) {			//查
		checkRange(index);
		
		Node tem = getNode(index);
		return tem != null ? (E)tem.element : null;
	}
	
	private void checkRange(int index) {
		if(index<0 || index>=size) {
			throw new RuntimeException("索引数字不合法"+index);
		}
	}
	
	private Node getNode(int index) {
		checkRange(index);
		
		Node tem = first;
		
		if(index <= (size>>1)) {		//索引小于等于元素个数的一半时，从前往后遍历
			for(int i=0;i<index;i++) {
				tem = tem.next;
			}
		}else {							//索引大于等于元素个数的一半时，从后往前遍历
			tem = last;
			for(int i=size-1;i>index;i--) {
				tem = tem.previous;
			}
		}
		return tem;
	}
	
	
	
	public void add(E element) {		//增
		Node node = new Node(element);
		
		if(first==null) {		//链表中没有元素
			
			first = node;
			last = node;
		}else {					//链表中已有元素，将新节点插入链表末尾
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
