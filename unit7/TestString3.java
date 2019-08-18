package cn.ttw.unit7;

public class TestString3 {
	public static void main(String[] args) {
		String s1 = "abc";
		byte[] arr = s1.getBytes();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
		
		String s2 = "中华人民共和国";
		byte[] arr2 = s2.getBytes();
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]+" ");
		}
		
	}
}

