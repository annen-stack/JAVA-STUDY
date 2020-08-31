package day05异常;

public class MyThread extends Thread{
	//构造方法
	public MyThread(String name) {
		super(name);
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
	}

}
