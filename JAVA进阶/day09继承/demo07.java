package day09�̳�;

/*
 * super ��������Ĵ洢�ռ��ʶ(�������Ϊ���׵�����)��
this ������ǰ���������(˭���þʹ���˭)��
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
