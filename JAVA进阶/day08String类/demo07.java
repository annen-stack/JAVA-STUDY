package day08String��;

/*
 * �� static ���γ�Ա����ʱ���ñ�����Ϊ������������ÿ�����󶼹���ͬһ���������ֵ���κζ��󶼿��Ը���
���������ֵ����Ҳ�����ڲ���������Ķ��������¶���������в�����

 */
public class demo07 {
	public static void main(String[] args) {
		Student s1 = new Student("����", 23);
		Student s2 = new Student("����", 24);
		Student s3 = new Student("����", 25);
		Student s4 = new Student("����", 26);
		s1.show(); // Student : name=����, age=23, sid=1
		s2.show(); // Student : name=����, age=24, sid=2
		s3.show(); // Student : name=����, age=25, sid=3
		s4.show(); // Student : name=����, age=26, sid=4
		}
	    

}
