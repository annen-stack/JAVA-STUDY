package day06�߳�ͬ��;

public class ChiHuo extends Thread{
	private BaoZi bz;
	public ChiHuo(String name,BaoZi bz){
		super(name);
		this.bz = bz;
	}
	@Override
	public void run() {
		while(true){
			synchronized (bz){
				if(bz.flag == false){//û����
					try {
						bz.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("�Ի����ڳ�"+bz.pier+bz.xianer+"����");
				bz.flag = false;
				bz.notify();
			}
		}
	}
}