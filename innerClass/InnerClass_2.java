package cn.ttw.innerClass;


/*

public class InnerClass_2 {
	public static void main(String[] args) {
		Outer.Inner oi = new Outer().new Inner();
		oi.show();
		

	}
}

//内部类能获取外部类的成员，是因为他能获取外部类的引用（外部类名.this）
class Outer{
	public int num = 10;
	class Inner{
		public int num = 20;
		public void show() {
			int num = 30;
			System.out.println(num);
			System.out.println(this.num);
			System.out.println(Outer.this.num);
		}
	}
}

*/