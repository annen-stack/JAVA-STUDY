package day07Scanner类;



public class demo02 {
	public static void main(String[] args) {
		Student00[] students= new Student00[3];// 创建学生数组
		Student00 s1 = new Student00("曹操",40);
		Student00 s2 = new Student00("刘备",35);
		Student00 s3 = new Student00("孙权",30);

		students[0]=s1;
		students[1]=s2;
		students[2]=s3;
		for(int x=0;x<students.length;x++) {
			Student00 s = students[x];
			System.out.println(s.getName()+"‐‐‐"+s.getAge());

		}
	}

}
