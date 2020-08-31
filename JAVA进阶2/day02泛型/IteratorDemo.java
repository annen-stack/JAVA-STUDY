package day02泛型;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 使用迭代器遍历集合
 */
public class IteratorDemo {
	public static void main(String[] args) {
		Collection<String> coll = new ArrayList<String>();
		coll.add("四川");
		coll.add("湖南");
		coll.add("北京");
		
		Iterator<String> it = coll.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
	}

}
