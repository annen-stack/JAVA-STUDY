package day02����;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * ʹ�õ�������������
 */
public class IteratorDemo {
	public static void main(String[] args) {
		Collection<String> coll = new ArrayList<String>();
		coll.add("�Ĵ�");
		coll.add("����");
		coll.add("����");
		
		Iterator<String> it = coll.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
	}

}
