package day09ผฬณะ;

class F{
	int num=5;
}
class Z extends F{
	int num2=6;
	public void show() {
		System.out.println("Fu num="+num);
		System.out.println("Zi num2="+num2);
	}
}
public class demo02 {
	public static void main(String[] args) {
		Z z = new Z();
		z.show();
	}

}
