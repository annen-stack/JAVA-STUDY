package day08String��;

public class demo02 {
	public static void main(String[] args) {
		//�����ַ�������
		String s = "helloworld";
		// int length():��ȡ�ַ����ĳ��ȣ���ʵҲ�����ַ�����
		System.out.println(s.length());
		System.out.println("�\�\�\�\�\�\�\�\");
		// String concat (String str):����ָ�����ַ������ӵ����ַ�����ĩβ.
		String s1 = "helloworld";
		String s2 = s1.concat("**hello itheima");
		System.out.println(s2);// helloworld**hello itheima
		// char charAt(int index):��ȡָ�����������ַ�
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(1));
		System.out.println("�\�\�\�\�\�\�\�\");
		// int indexOf(String str):��ȡstr���ַ��������е�һ�γ��ֵ�����,û�з��ة\1
		System.out.println(s1.indexOf("l"));
		System.out.println(s1.indexOf("owo"));
		System.out.println(s1.indexOf("ak"));
		System.out.println("�\�\�\�\�\�\�\�\");
		// String substring(int start):��start��ʼ��ȡ�ַ������ַ�����β
		System.out.println(s1.substring(0));
		System.out.println(s1.substring(5));
		System.out.println("�\�\�\�\�\�\�\�\");
		// String substring(int start,int end):��start��end��ȡ�ַ�������start������end��
		System.out.println(s1.substring(0, s1.length()));
		System.out.println(s1.substring(3,8));
		}
}

