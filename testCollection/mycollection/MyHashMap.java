package cn.ttw.testCollection.mycollection;

/**
 * 	�Զ���HashMap
 * 	��дtostring����
 *	�ײ�Ϊ����+����
 *
 */

public class MyHashMap<K,V> {
	
	Node2[] table;		//λͰ����
	int size;			//��ż�ֵ�Եĸ���
	
	public MyHashMap() {
		table = new Node2[16];		//����һ��Ϊ2��������
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
			//���˴�����Ϊ�գ���ֱ�ӽ��½ڵ����
			table[newNode.hash] = newNode;
			size++;
		}else {
			//�˴����鲻Ϊ�գ��������Ӧ����
			while(tem!=null) {
				if(tem.key.equals(key)) {
					//keyֵ�ظ�ʱ����Ӧ�ڵ��value�ı伴��
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
	
	//�����ϣֵ����
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
				if(tem.key.equals(key)) {		//�˽ڵ��keyֵ����ȡkeyֵ���
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
		
		//��������
		for(int i=0;i<table.length;i++) {
			Node2 tem = table[i];
			//��������
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

