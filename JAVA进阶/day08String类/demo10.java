package day08String��;

import java.util.Arrays;

public class demo10 {
	public static void main(String[] args) {
		// ����int ����
		int[] arr = {24, 7, 5, 48, 4, 46, 35, 11, 6, 2};
		System.out.println("����ǰ:"+ Arrays.toString(arr)); // ����ǰ:[24, 7, 5, 48, 4, 46, 35, 11, 6,
	
		// ��������
		Arrays.sort(arr);
		System.out.println("�����:"+ Arrays.toString(arr));// �����:[2, 4, 5, 6, 7, 11, 24, 35, 46,
		
		}
}
