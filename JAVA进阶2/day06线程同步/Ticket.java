package day06线程同步;

/*
 * 当我们使用多个线程访问同一资源的时候，且多个线程中对资源有写的操作，就容易出现线程安全问题。
 * 
 * 
 * 也就是说在某个线程修改共享资源的时候，其他线程不能修改该资源，等待修改完毕同步之后，才能去抢夺CPU
资源，完成对应的操作，保证了数据的同步性，解决了线程不安全的现象。
 */
public class Ticket implements Runnable{
	private int ticket = 100;
	Object lock = new Object();
	/*
	 * 执行卖票操作
	 */
	@Override
	public void run() {
		//每个窗口卖票的操作
		//窗口 永远开启
		while(true){
			synchronized (lock) {
				if(ticket>0){//有票 可以卖
					//出票操作
					//使用sleep模拟一下出票时间
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						// TODO Auto‐generated catch block
						e.printStackTrace();
					}
					//获取当前线程对象的名字
					String name = Thread.currentThread().getName();
					System.out.println(name+"正在卖:"+ticket--);
				}
			}
		}
	}
}
