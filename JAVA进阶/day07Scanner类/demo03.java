package day07Scanner��;

import java.util.ArrayList;

//java.util.ArrayList �Ǵ�С�ɱ�������ʵ�֣��洢���ڵ����ݳ�ΪԪ�ء������ṩһЩ�����������ڲ��洢
//��Ԫ�ء� ArrayList �пɲ������Ԫ�أ����СҲ�Զ�������
/*
 * ArrayList<String> list = new ArrayList<>();
 * public boolean add(E e) �� ��ָ����Ԫ����ӵ��˼��ϵ�β��
 */
public class demo03 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		String s1="�ܲ�";
		list.add("hello");
		list.add("world");
		list.add("java");
		
		System.out.println("get:"+list.get(0));
		System.out.println(list.size());
		
		System.out.println("remove"+list.remove(0));
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
}

}
