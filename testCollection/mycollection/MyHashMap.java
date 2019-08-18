package cn.ttw.testCollection.mycollection;

/**
 * 	自定义HashMap
 * 	重写tostring方法
 *	底层为数组+链表
 *
 */

public class MyHashMap<K,V> {
	
	Node2[] table;		//位桶数组
	int size;			//存放键值对的个数
	
	public MyHashMap() {
		table = new Node2[16];		//长度一般为2的整数幂
	}
	
	public void put(K key,V value) {
		
		Node2 newNode = new Node2();
		newNode.hash = myHash(key.hashCode(),table.length-1);
		newNode.key = key;
		newNode.value = value;
		newNode.next = null;
		boolean keyRepeat = false;
		
		Node2 tem = table[newNode.hash];
		Node2 iterLast = null;
		
		
		if(tem==null) {
			//若此处数组为空，则直接将新节点放入
			table[newNode.hash] = newNode;
			size++;
		}else {
			//此处数组不为空，则遍历对应链表
			while(tem!=null) {
				if(tem.key.equals(key)) {
					//key值重复时将相应节点的value改变即可
					tem.value = value;
					keyRepeat = true;
					break;
				}else {
					iterLast = tem;
					tem = tem.next;
				}
			}
			if(!keyRepeat) {
				iterLast.next = newNode;
				size++;	
			}
		}
	}
	
	//计算哈希值函数
	public static int myHash(int v,int length) {
		//System.out.println("hash in myHash:"+(v&(length-1)));
		//System.out.println("hash in myHash:"+(v%length));
		return v&(length-1);
		
	}
	
	public V get(K key) {
		
		int hash = myHash(key.hashCode(),table.length-1);
		V value = null;
		
		if(table[hash]!=null) {
			Node2 tem = table[hash];
			
			while(tem!=null) {
				if(tem.key.equals(key)) {		//此节点的key值和所取key值相等
					value = (V) tem.value;
					break;
				}else {
					tem = tem.next;
				}
			}
		}
		return value;
	}
	
	
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder("{");
		
		//遍历数组
		for(int i=0;i<table.length;i++) {
			Node2 tem = table[i];
			//遍历链表
			while(tem!=null) {
				sb.append(tem.key+":"+tem.value+",");
				tem = tem.next;
			}
		}
		sb.setCharAt(sb.length()-1, '}');
		
		return sb.toString();
	}
	
	
	public static void main(String[] args) {
		MyHashMap<Integer,String> m = new MyHashMap<>();
		m.put(10, "aa");
		m.put(20, "bb");
		m.put(30, "cc");
		m.put(20, "sss");
		m.put(85, "lll");
		m.put(53, "ddd");
		m.put(69, "aaa");
		
		System.out.println(m);
		System.out.println(m.get(53));
	}
	
}

