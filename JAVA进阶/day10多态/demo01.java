package day10��̬;


class Cat extends Animal {
	public void eat() {
		System.out.println("����");
	}
	public void catchMouse() {
		System.out.println("ץ����");
		}

}
class Dog extends Animal {
	public void eat() {
		System.out.println("�Թ�ͷ");
	}
	public void watchHouse() {
		System.out.println("����");
		}

}

public class demo01 {
	public static void main(String[] args) {
		// ��̬��ʽ����������
		Animal a1 = new Cat();
		// ���õ��� Cat �� eat
		a1.eat();
		// ��̬��ʽ����������
		Animal a2 = new Dog();
		// ���õ��� Dog �� eat
		a2.eat();
	}
}
