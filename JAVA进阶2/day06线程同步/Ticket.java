package day06�߳�ͬ��;

/*
 * ������ʹ�ö���̷߳���ͬһ��Դ��ʱ���Ҷ���߳��ж���Դ��д�Ĳ����������׳����̰߳�ȫ���⡣
 * 
 * 
 * Ҳ����˵��ĳ���߳��޸Ĺ�����Դ��ʱ�������̲߳����޸ĸ���Դ���ȴ��޸����ͬ��֮�󣬲���ȥ����CPU
��Դ����ɶ�Ӧ�Ĳ�������֤�����ݵ�ͬ���ԣ�������̲߳���ȫ������
 */
public class Ticket implements Runnable{
	private int ticket = 100;
	Object lock = new Object();
	/*
	 * ִ����Ʊ����
	 */
	@Override
	public void run() {
		//ÿ��������Ʊ�Ĳ���
		//���� ��Զ����
		while(true){
			synchronized (lock) {
				if(ticket>0){//��Ʊ ������
					//��Ʊ����
					//ʹ��sleepģ��һ�³�Ʊʱ��
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						// TODO Auto�\generated catch block
						e.printStackTrace();
					}
					//��ȡ��ǰ�̶߳��������
					String name = Thread.currentThread().getName();
					System.out.println(name+"������:"+ticket--);
				}
			}
		}
	}
}
