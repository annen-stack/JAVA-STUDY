package day09�̳�;

/*
 * ��������̳и�������Ժ���Ϊ��ʹ�������������븸����ͬ�����ԡ���ͬ����Ϊ���������ֱ��
���ʸ����еķ�˽�е����Ժ���Ϊ��
 */
class Employee{
	String name;
	public void work() {
		System.out.println("���ľ�������");
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
		t.name="С��";
		t.printName();
		t.work();
	}

}
