package cn.ttw.testCollection.collection;


/**
 * Collection(单列集合)
 * 		List(存取有序，有索引，可重复)
 * 			ArrayList：底层数组实现，线程不安全，查找修改快，增删比较慢
 * 			LinkedList：底层链表实现，线程不安全，增删比较快，查找和修改比较慢
 * 			Vector：底层数组实现，线程安全，增删改查都慢
 * 			
 * 			如果查找和修改多，用ArrayList
 * 			如果增删多，用LinkedList
 * 			如果都多，用ArrayList			
 * 
 * 		Set(存取无序，无索引，不可重复)
 * 			HashSet：底层哈希算法实现
 * 				LinkedHashSet：底层链表实现，也可以保证元素唯一，和HashSet原理一样
 * 			TreeSet：底层二叉树实现，一般在开发时不需要对存储的元素排序，所以在开发时大多用HashSet，因为它效率较高
 * 					 但在面试时较多，问你有几种排序方式和其区别
 * 
 * 
 * Map
 * 		HashMap：底层哈希算法，针对键
 * 			LinkedHashMap：底层链表，针对键
 * 		TreeMap：底层二叉树算法，针对键
 * 
 * 		（开发中HashMap使用较多）
 * 
 */



public class Conclusion {

	public static void main(String[] args) {

	}
}
