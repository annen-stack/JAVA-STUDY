package day09�̳�;

class Fu1{
	public void show() {
		System.out.println("Fu���е�show����ִ��");
	}
}

class Zi1 extends Fu1{
	public void show2() {
		System.out.println("Zi���е�show2����ִ��");
	}
}
public class demo04 {
	public static void main(String[] args) {
		Zi1 z =new Zi1();
		z.show();
		z.show2();
	}

}
