package day05�쳣;

import java.io.FileNotFoundException;

public class TryCatchDemo4 {
	public static void main(String[] args) {
		try {
			read("a.txt");
		} catch (FileNotFoundException e) {
			//ץȡ�����Ǳ������쳣 �׳�ȥ����������
			throw new RuntimeException(e);
		} finally {
			System.out.println("���ܳ������������ﶼ���ᱻִ�С�");
		}
		System.out.println("over");
	}
/*
*
* ���� ��ǰ����������� ���쳣 �б������쳣
*/
	public static void read(String path) throws FileNotFoundException {
		if (!path.equals("b.txt")) {//������� a.txt����ļ�
			// �Ҽ��� ������� a.txt ��Ϊ ���ļ������� ��һ������ Ҳ�����쳣 throw
			throw new FileNotFoundException("�ļ�������");
		}
	}
}
