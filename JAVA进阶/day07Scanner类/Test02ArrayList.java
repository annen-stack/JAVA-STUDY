package day07Scanner��;

import java.util.ArrayList;

public class Test02ArrayList {
	public static void main(String[] args) {
		//�������϶���
		ArrayList<Student00> list = new ArrayList<Student00>();
		//����ѧ������
		Student00 s1 = new Student00("����ӱ",18);
		Student00 s2 = new Student00("����",20);
		Student00 s3 = new Student00("����",25);
		Student00 s4 = new Student00("����",19);
		//��ѧ��������ΪԪ����ӵ�������
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		//��������
		for(int x = 0; x < list.size(); x++) {
			Student00 s = list.get(x);
			System.out.println(s.getName()+"�\�\�\"+s.getAge());
		}
		}


}
