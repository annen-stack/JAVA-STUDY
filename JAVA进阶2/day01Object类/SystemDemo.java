package day01Object��;

public class SystemDemo {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		for(int i=0;i<1000;i++) {
			System.out.println(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("����ʱ���룺"+(end-start));
	}

}
