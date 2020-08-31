package day06线程同步;

public class Demo {
	public static void main(String[] args) {
		System.out.println("这里是main线程");
		MyThread mt = new MyThread("小强");
		mt.start();//开启了一个新的线程
		for (int i = 0; i < 20; i++) {
		System.out.println("旺财:"+i);
		}
		}

}
