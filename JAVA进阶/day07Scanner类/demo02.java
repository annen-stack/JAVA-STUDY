package day07Scanner��;



public class demo02 {
	public static void main(String[] args) {
		Student00[] students= new Student00[3];// ����ѧ������
		Student00 s1 = new Student00("�ܲ�",40);
		Student00 s2 = new Student00("����",35);
		Student00 s3 = new Student00("��Ȩ",30);

		students[0]=s1;
		students[1]=s2;
		students[2]=s3;
		for(int x=0;x<students.length;x++) {
			Student00 s = students[x];
			System.out.println(s.getName()+"�\�\�\"+s.getAge());

		}
	}

}
