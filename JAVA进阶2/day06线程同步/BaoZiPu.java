package day06�߳�ͬ��;

public class BaoZiPu extends Thread {
	private BaoZi bz;
	public BaoZiPu(String name,BaoZi bz){
		super(name);
		this.bz = bz;
	}
	@Override
	public void run() {
		int count = 0;
		//�����
		while(true){
			//ͬ��
			synchronized (bz){
				if(bz.flag == true){//������Դ ����
					try {
						bz.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
						}
				}
				// û�а��� �����
				System.out.println("�����̿�ʼ������");
				if(count%2 == 0){
					// ��Ƥ ����
					bz.pier = "��Ƥ";
					bz.xianer = "����";
				}else{
					// ��Ƥ ţ����
					bz.pier = "��Ƥ";
					bz.xianer = "ţ����";
				}
				count++;
				bz.flag=true;
				System.out.println("��������ˣ�"+bz.pier+bz.xianer);
				System.out.println("�Ի����԰�");
				//���ѵȴ��߳� ���Ի���
				bz.notify();
			}
		}
	}
}