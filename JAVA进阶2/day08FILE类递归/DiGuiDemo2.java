package day08FILE��ݹ�;

import java.io.File;

public class DiGuiDemo2 {
	public static void main(String[] args) {
		// ����File����
		File dir = new File("D:\\aaa");
		// ���ô�ӡĿ¼����
		printDir(dir);
		}
		public static void printDir(File dir) {
		// ��ȡ���ļ���Ŀ¼
		File[] files = dir.listFiles();
		// ѭ����ӡ
		/*
		�ж�:
		�����ļ�ʱ,��ӡ����·��.
		����Ŀ¼ʱ,�������ô�ӡĿ¼�ķ���,�γɵݹ����.
		*/
		for (File file : files) {
		// �ж�
		if (file.isFile()) {
		// ���ļ�,����ļ�����·��
		System.out.println("�ļ���:"+ file.getAbsolutePath());
		} else {
		// ��Ŀ¼,���Ŀ¼����·��
		System.out.println("Ŀ¼:"+file.getAbsolutePath());
		// ��������,����printDir,�γɵݹ�
		printDir(file);
		}
		}
		}


}
