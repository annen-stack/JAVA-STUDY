package day07Scanner类;

import java.util.ArrayList;

public class Test02ArrayList {
	public static void main(String[] args) {
		//创建集合对象
		ArrayList<Student00> list = new ArrayList<Student00>();
		//创建学生对象
		Student00 s1 = new Student00("赵丽颖",18);
		Student00 s2 = new Student00("唐嫣",20);
		Student00 s3 = new Student00("景甜",25);
		Student00 s4 = new Student00("柳岩",19);
		//把学生对象作为元素添加到集合中
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		//遍历集合
		for(int x = 0; x < list.size(); x++) {
			Student00 s = list.get(x);
			System.out.println(s.getName()+"‐‐‐"+s.getAge());
		}
		}


}
