package day06�߳�ͬ��;

public class Demo2 {
	public static void main(String[] args) {
		//�����Զ�������� �߳��������
		MyRunnable mr = new MyRunnable();
		//�����̶߳���
		Thread t = new Thread(mr, "Сǿ");
		t.start();
		for (int i = 0; i < 20; i++) {
			System.out.println("���� " + i);
		}
	}
}
