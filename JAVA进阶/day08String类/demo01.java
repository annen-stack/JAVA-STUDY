package day08String��;
/*
 * // �޲ι���
String str = new String������
// ͨ���ַ����鹹��
char chars[] = {'a', 'b', 'c'};
String str2 = new String(chars);
// ͨ���ֽ����鹹��
byte bytes[] = { 97, 98, 99 };
String str3 = new String(bytes);
 */
public class demo01 {
	public static void main(String[] args) {
		// �����ַ�������
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "HELLO";
		// boolean equals(Object obj):�Ƚ��ַ����������Ƿ���ͬ
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1.equals(s3)); // false
		System.out.println("�\�\�\�\�\�\�\�\�\�\�\");
		//boolean equalsIgnoreCase(String str):�Ƚ��ַ����������Ƿ���ͬ,���Դ�Сд
		System.out.println(s1.equalsIgnoreCase(s2)); // true
		System.out.println(s1.equalsIgnoreCase(s3)); // true
		System.out.println("�\�\�\�\�\�\�\�\�\�\�\");
		}
}
