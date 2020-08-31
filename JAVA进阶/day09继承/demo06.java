package day09继承;

/*
 * 1.. 构造方法的名字是与类名一致的。所以子类是无法继承父类构造方法的
 * 2. 构造方法的作用是初始化成员变量的。所以子类的初始化过程中，必须先执行父类的初始化动作。子类的构
造方法中默认有一个 super() ，表示调用父类的构造方法
 */

class Fu0{
	private int n;
	Fu0(){//父类构造方法
		System.out.println("Fu");
	}
}

class Zi0 extends Fu0{
	Zi0(){
		super();
		System.out.println("Zi()");
	}
}
public class demo06 {
	public static void main(String args[]) {
		Zi0 zi = new Zi0();
	}

}
