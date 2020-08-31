package day08String类;

/*
 * 当 static 修饰成员变量时，该变量称为类变量。该类的每个对象都共享同一个类变量的值。任何对象都可以更改
该类变量的值，但也可以在不创建该类的对象的情况下对类变量进行操作。

 */
public class demo07 {
	public static void main(String[] args) {
		Student s1 = new Student("张三", 23);
		Student s2 = new Student("李四", 24);
		Student s3 = new Student("王五", 25);
		Student s4 = new Student("赵六", 26);
		s1.show(); // Student : name=张三, age=23, sid=1
		s2.show(); // Student : name=李四, age=24, sid=2
		s3.show(); // Student : name=王五, age=25, sid=3
		s4.show(); // Student : name=赵六, age=26, sid=4
		}
	    

}
