package day09继承;

class Fu1{
	public void show() {
		System.out.println("Fu类中的show方法执行");
	}
}

class Zi1 extends Fu1{
	public void show2() {
		System.out.println("Zi类中的show2方法执行");
	}
}
public class demo04 {
	public static void main(String[] args) {
		Zi1 z =new Zi1();
		z.show();
		z.show2();
	}

}
