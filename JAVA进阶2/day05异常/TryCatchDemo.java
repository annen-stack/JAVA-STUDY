package day05�쳣;

import java.io.FileNotFoundException;

public class TryCatchDemo {
	public static void main(String[] args) {
		try {// �������쳣ʱ�������д���ʽ��Ҫô����Ҫô������
			read("b.txt");
		} catch (FileNotFoundException e) {// ��������Ҫ����ʲô�أ�
			//try���׳�����ʲô�쳣���������оͶ���ʲô�쳣����
			System.out.println(e);
		}
		System.out.println("over");
	}
/*
*
* ���� ��ǰ����������� ���쳣 �б������쳣
*/
	public static void read(String path) throws FileNotFoundException {
		if (!path.equals("a.txt")) {//������� a.txt����ļ�
			// �Ҽ��� ������� a.txt ��Ϊ ���ļ������� ��һ������ Ҳ�����쳣 throw
			throw new FileNotFoundException("�ļ�������");
		}
	}
}