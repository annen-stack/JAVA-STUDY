package day08FILE��ݹ�;

import java.io.File;

public class DiGuiDemo3 {
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
			for (File file : files) {
				if (file.isFile()) {
					// ���ļ����ж��ļ���������ļ�����·��
					if (file.getName().endsWith(".java")) {
						System.out.println("�ļ���:" + file.getAbsolutePath());
					}
				} else {
					// ��Ŀ¼����������,�γɵݹ�
					printDir(file);
				}
			}
		}

}
