package day10��̬;


public class demo02 {
	public static void main(String[] args) {
		// ����ת��
		Animal a = new Dog();
		a.eat(); // ���õ��� Cat �� eat
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
