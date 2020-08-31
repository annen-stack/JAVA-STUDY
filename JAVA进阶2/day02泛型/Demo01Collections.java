package day02泛型;

import java.util.ArrayList;
import java.util.Collection;

public class Demo01Collections {
	public static void main(String[] args) {
		Collection<String> coll = new ArrayList<String>();//集合
		coll.add("小红");
		coll.add("小名");
		coll.add("小白");
		
		System.out.println("判断 扫地僧是否在集合中"+coll.contains("小红"));
		System.out.println("集合中有"+coll.size()+"个元素");
		//转换成数组
		Object[] objects = coll.toArray();
		for(int i=0;i<objects.length;i++) {
			System.out.println(objects[i]);
		}
		
		coll.clear(); //清空集合
		
		System.out.println(coll.isEmpty());
		
	}

}
