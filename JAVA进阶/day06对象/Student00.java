package day06对象;

public class Student00  {
	private String name;
	private int age;
	//当一个变量被创建时，构造方法被用来初始化该对象
	//给对象的成员变量赋初值
	
	//无参构造
	public Student00() {}
	
	//有参构造
	public Student00(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public int getAge() {
		return age;
	}


}
