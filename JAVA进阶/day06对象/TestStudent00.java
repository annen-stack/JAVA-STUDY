package day06����;

public class TestStudent00 {
	public static void main(String[] args) {
		//�޲ι���ʹ��
		Student00 s= new Student00();
		s.setName("����");
		s.setAge(18);
		System.out.println(s.getName()+"�\�\�\"+s.getAge());
		
		//���ι���ʹ��
		Student00 s2= new Student00("����ӱ",18);
		System.out.println(s2.getName()+"�\�\�\"+s2.getAge());
		}

}
