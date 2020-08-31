package day07Scanner类;

import java.util.ArrayList;

//java.util.ArrayList 是大小可变的数组的实现，存储在内的数据称为元素。此类提供一些方法来操作内部存储
//的元素。 ArrayList 中可不断添加元素，其大小也自动增长。
/*
 * ArrayList<String> list = new ArrayList<>();
 * public boolean add(E e) ： 将指定的元素添加到此集合的尾部
 */
public class demo03 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		String s1="曹操";
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
