package day08String��;

public class demo03 {
	public static void main(String[] args) {
		//�����ַ�������
		String s = "abcde";
		// char[] toCharArray():���ַ���ת��Ϊ�ַ�����
		char[] chs = s.toCharArray();
		for(int x = 0; x < chs.length; x++) {
			System.out.println(chs[x]);
		}
		System.out.println("�\�\�\�\�\�\�\�\�\�\�\");
		// byte[] getBytes ():���ַ���ת��Ϊ�ֽ�����
		byte[] bytes = s.getBytes();
		for(int x = 0; x < bytes.length; x++) {
			System.out.println(bytes[x]);
		}
		System.out.println("�\�\�\�\�\�\�\�\�\�\�\");
		
		String str = "itcast itheima";
		String replace = str.replace("it", "IT");
		System.out.println(replace); // ITcast ITheima
		System.out.println("�\�\�\�\�\�\�\�\�\�\�\");
		}



}
