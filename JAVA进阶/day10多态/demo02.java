package day10多态;


public class demo02 {
	public static void main(String[] args) {
		// 向上转型
		Animal a = new Dog();
		a.eat(); // 调用的是 Cat 的 eat
		if(a instanceof Cat) {
			Cat c = (Cat)a;
			c.catchMouse();
		}
		else if(a instanceof Dog) {
			Dog d = (Dog)a;
			d.watchHouse(); 
		}
	}
}
