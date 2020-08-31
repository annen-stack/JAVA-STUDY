package day06对象;

public class TestStudent00 {
	public static void main(String[] args) {
		//无参构造使用
		Student00 s= new Student00();
		s.setName("柳岩");
		s.setAge(18);
		System.out.println(s.getName()+"‐‐‐"+s.getAge());
		
		//带参构造使用
		Student00 s2= new Student00("赵丽颖",18);
		System.out.println(s2.getName()+"‐‐‐"+s2.getAge());
		}

}
