package day09继承;

/*
 * super ：代表父类的存储空间标识(可以理解为父亲的引用)。
this ：代表当前对象的引用(谁调用就代表谁)。
 */

class Animal{
	public void eat() {
		System.out.println("animal : eat");
	}
}

class Cat extends Animal{
	public void eat() {
		System.out.println("cat : eat");
	}
	
	public void eatTest() {
		super.eat();
		this.eat();
	}
	
}
public class demo07 {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.eat();
		
		Cat c = new Cat();
		c.eatTest();
	}

}
