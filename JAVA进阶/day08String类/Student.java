package day08String��;

public class Student {
	private String name;
	private int age;
	// ѧ����id
	private int sid;
// ���������¼ѧ������������ѧ��
	public static int numberOfStudent = 0;
	public Student(String name, int age){
		this.name = name;
		this.age = age;
// ͨ�� numberOfStudent ��ѧ������ѧ��
		this.sid = ++numberOfStudent;
	}
// ��ӡ����ֵ
	public void show() {
		System.out.println("Student : name=" + name + ", age=" + age + ", sid=" + sid );
	}
	
	public static void showNum() {
		System.out.println("num:" + numberOfStudent);
		}

}
