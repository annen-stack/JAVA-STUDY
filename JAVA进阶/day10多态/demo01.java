package day10多态;


class Cat extends Animal {
	public void eat() {
		System.out.println("吃鱼");
	}
	public void catchMouse() {
		System.out.println("抓老鼠");
		}

}
class Dog extends Animal {
	public void eat() {
		System.out.println("吃骨头");
	}
	public void watchHouse() {
		System.out.println("看家");
		}

}

public class demo01 {
	public static void main(String[] args) {
		// 多态形式，创建对象
		Animal a1 = new Cat();
		// 调用的是 Cat 的 eat
		a1.eat();
		// 多态形式，创建对象
		Animal a2 = new Dog();
		// 调用的是 Dog 的 eat
		a2.eat();
	}
}
