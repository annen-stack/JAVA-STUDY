package day08String��;

import java.util.Scanner;

public class demo06 {
	public static void main(String[] args) {
		//����¼��һ���ַ�������
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ������ݣ�");
		String s = sc.nextLine();
		//��������ͳ�Ʊ�������ʼ��ֵ����0
		int bigCount = 0;
		int smallCount = 0;
		int numberCount = 0;
		//�����ַ������õ�ÿһ���ַ�
		for(int x=0; x<s.length(); x++) {
			char ch = s.charAt(x);
			//���ַ������ж�
			if(ch>='A'&&ch<='Z') {
				bigCount++;
			}else if(ch>='a'&&ch<='z') {
				smallCount++;
			}else if(ch>='0'&&ch<='9') {
				numberCount++;
			}else {
				System.out.println("���ַ�"+ch+"�Ƿ�");
			}
		}
		//������
		System.out.println("��д�ַ���"+bigCount+"��");
		System.out.println("Сд�ַ���"+smallCount+"��");
		System.out.println("�����ַ���"+numberCount+"��");
	}
}