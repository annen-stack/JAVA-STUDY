package day06�߳�ͬ��;

public class Demo {
	public static void main(String[] args) {
		System.out.println("������main�߳�");
		MyThread mt = new MyThread("Сǿ");
		mt.start();//������һ���µ��߳�
		for (int i = 0; i < 20; i++) {
		System.out.println("����:"+i);
		}
		}

}
