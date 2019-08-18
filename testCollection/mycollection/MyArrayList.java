package cn.ttw.testCollection.mycollection;

/**
 * 
 * 手动实现ArrayList中的增,删,改,查功能
 * @author 腾腾娃发光的板砖
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
			throw new RuntimeException("容器容量不能为负");
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
	
	//步骤：
	//1.判断元素是否已满，若已满就开辟新数组完成扩容
	//2.加入新元素并size++
	public void add(E element) {			//增
		
		if(size == elementData.length) {
			Object[] newArray = new Object[elementData.length+(elementData.length>>1)];		//数组扩容，每次增加目前数组长度的1/2
			
			System.arraycopy(elementData, 0, newArray, 0, elementData.length);
			elementData = newArray;				//指向新数组，完成扩容
		}
		elementData[size++] = element;		//size表示已添加元素个数
		
	}
	
	public E get(int index) {				//查
		checkRange(index);					//判断索引是否合法
		return (E)elementData[index];		//返回索引对应元素
	}
	
	public void set(E element,int index) {	//改
		checkRange(index);					//检查索引是否越界
		elementData[index]=element;			//更改相应索引位置元素
	}
	
	public void checkRange(int index) {
		//索引合法判断[0,size)
		if(index<0 || index>=size) {							//不合法就抛出异常
			throw new RuntimeException("索引不合法"+index);
		}		
	}
	
	//根据元素删除
	public void remove(E element) {			//删
		//将传入的element和所有元素挨个比较，获得第一个比较为true的元素并返回
		for(int i=0;i<size;i++) {
			if(element.equals(get(i))) {	//equals和==的区别：前者比较的是对象的内容，而后者比较的是对象的地址
				remove(i);
			}
		}
	}
	
	//根据索引删除
	public void remove(int index) {	
		//a,b,c,d,e,f,g,h
		//a,b,c,e,f,g,h
		int Movednum = elementData.length-index-1;		//移动元素个数：带删除元素后的所有元素的个数
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
