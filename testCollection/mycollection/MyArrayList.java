package cn.ttw.testCollection.mycollection;

/**
 * 
 * �ֶ�ʵ��ArrayList�е���,ɾ,��,�鹦��
 * @author �����޷���İ�ש
 *
 */
public class MyArrayList<E> {
	private Object[] elementData;
	private int size;
	
	private static final int DEFALT_CAPACITY = 10;
	
	public MyArrayList() {
		elementData = new Object[DEFALT_CAPACITY];
	}
	
	public MyArrayList(int capacity) {
		if(capacity<0) {
			throw new RuntimeException("������������Ϊ��");
		}else if(capacity==0) {
			elementData = new Object[DEFALT_CAPACITY];
		}else {
			elementData = new Object[capacity];
		}
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0 ? true : false;
	}
	
	//���裺
	//1.�ж�Ԫ���Ƿ��������������Ϳ����������������
	//2.������Ԫ�ز�size++
	public void add(E element) {			//��
		
		if(size == elementData.length) {
			Object[] newArray = new Object[elementData.length+(elementData.length>>1)];		//�������ݣ�ÿ������Ŀǰ���鳤�ȵ�1/2
			
			System.arraycopy(elementData, 0, newArray, 0, elementData.length);
			elementData = newArray;				//ָ�������飬�������
		}
		elementData[size++] = element;		//size��ʾ�����Ԫ�ظ���
		
	}
	
	public E get(int index) {				//��
		checkRange(index);					//�ж������Ƿ�Ϸ�
		return (E)elementData[index];		//����������ӦԪ��
	}
	
	public void set(E element,int index) {	//��
		checkRange(index);					//��������Ƿ�Խ��
		elementData[index]=element;			//������Ӧ����λ��Ԫ��
	}
	
	public void checkRange(int index) {
		//�����Ϸ��ж�[0,size)
		if(index<0 || index>=size) {							//���Ϸ����׳��쳣
			throw new RuntimeException("�������Ϸ�"+index);
		}		
	}
	
	//����Ԫ��ɾ��
	public void remove(E element) {			//ɾ
		//�������element������Ԫ�ذ����Ƚϣ���õ�һ���Ƚ�Ϊtrue��Ԫ�ز�����
		for(int i=0;i<size;i++) {
			if(element.equals(get(i))) {	//equals��==������ǰ�߱Ƚϵ��Ƕ�������ݣ������߱Ƚϵ��Ƕ���ĵ�ַ
				remove(i);
			}
		}
	}
	
	//��������ɾ��
	public void remove(int index) {	
		//a,b,c,d,e,f,g,h
		//a,b,c,e,f,g,h
		int Movednum = elementData.length-index-1;		//�ƶ�Ԫ�ظ�������ɾ��Ԫ�غ������Ԫ�صĸ���
		if(Movednum>0) {
			System.arraycopy(elementData, index+1, elementData, index, Movednum);
		}
		elementData[--size] = null;
		
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("[");
		for(int i=0;i<size;i++) {
			sb.append(elementData[i]+",");

		}
			sb.setCharAt(sb.length()-1, ']');
		return sb.toString();
	}
	
	
	public static void main(String[] args) {
		MyArrayList s1 = new MyArrayList(20);
		for(int i=0;i<50;i++) {
			s1.add("ttw"+i);
			
		}
		s1.set("tengtengwa", 6);
		System.out.println(s1);
		System.out.println(s1.get(6));
		
		s1.remove(3);
		s1.remove("ttw14");
		System.out.println(s1);
		
		System.out.println(s1.size());
		System.out.println(s1.isEmpty());
	}
	
}
