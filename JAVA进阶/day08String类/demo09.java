package day08String��;

import java.util.Arrays;

/*
 * java.util.Arrays �������������������ĸ��ַ�������������������ȡ������з�����Ϊ��̬��������������
�ǳ��򵥡�

 */
public class demo09 {
	public static void main(String[] args) {
		// ����int ����
		int[] arr = {2,34,35,4,657,8,69,9};
		// ��ӡ����,�����ֵַ
		System.out.println(arr); // [I@2ac1fdc4
		// ��������תΪ�ַ���
		String s = Arrays.toString(arr);
		// ��ӡ�ַ���,�������
		System.out.println(s); // [2, 34, 35, 4, 657, 8, 69, 9]
		}

}
