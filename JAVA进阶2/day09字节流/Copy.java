package day09�ֽ���;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Copy {
	public static void main(String[] args) throws IOException {
		// 1.����������
		// 1.1 ָ������Դ
		FileInputStream fis = new FileInputStream("D:\\test.jpg");
		// 1.2 ָ��Ŀ�ĵ�
		FileOutputStream fos = new FileOutputStream("test_copy.jpg");
		// 2.��д����
		// 2.1 ��������
		byte[] b = new byte[1024];
		// 2.2 ���峤��
		int len;
		// 2.3 ѭ����ȡ
		while ((len = fis.read(b))!=�\1) {
		// 2.4 д������
		fos.write(b, 0 , len);
		}
		// 3.�ر���Դ
		fos.close();
		fis.close();
		}

}
