package day09继承;

/*
 * 就是子类继承父类的属性和行为，使得子类对象具有与父类相同的属性、相同的行为。子类可以直接
访问父类中的非私有的属性和行为。
 */
class Employee{
	String name;
	public void work() {
		System.out.println("尽心尽力工作");
	}
}
class Teacher extends Employee{
	public void printName() {
		System.out.println("name="+name);
	}
}
public class demo01 {
	public static void main(String[] args) {
		Teacher t =new Teacher();
		t.name="小明";
		t.printName();
		t.work();
	}

}
