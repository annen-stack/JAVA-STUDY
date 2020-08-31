package day09继承;

/*
 * 子父类中出现了同名的成员变量时，在子类中需要访问父类中非私有成员变量时，需要使用 super 关键字，修饰
父类成员变量，类似于之前学过的 this 
 */

class Fu{
	int num=5;
}
class Zi extends Fu{
	int num=6;
	public void show() {
		System.out.println("Fu num="+super.num);
		System.out.println("Zi num2="+this.num);
	}
}

public class demo03 {
	public static void main(String[] args) {
		Zi z = new Zi();
		z.show();
	}
}
