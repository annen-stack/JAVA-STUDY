package day02����;

import java.util.ArrayList;
import java.util.Collection;

public class Demo01Collections {
	public static void main(String[] args) {
		Collection<String> coll = new ArrayList<String>();//����
		coll.add("С��");
		coll.add("С��");
		coll.add("С��");
		
		System.out.println("�ж� ɨ��ɮ�Ƿ��ڼ�����"+coll.contains("С��"));
		System.out.println("��������"+coll.size()+"��Ԫ��");
		//ת��������
		Object[] objects = coll.toArray();
		for(int i=0;i<objects.length;i++) {
			System.out.println(objects[i]);
		}
		
		coll.clear(); //��ռ���
		
		System.out.println(coll.isEmpty());
		
	}

}
