package day09�̳�;
/*
 * �����г����븸��һģһ���ķ���ʱ������ֵ���ͣ��������Ͳ����б���ͬ��������ָ���Ч
����Ҳ��Ϊ��д���߸�д���������䣬����ʵ�֡�
 */
class Phone{
	public void sendMessage() {
		System.out.println("������");
	}
	public void call() {
		System.out.println("��绰");
	}
	public void showNum() {
		System.out.println("������ʾ����");
	}
}
class NewPhone extends Phone{
	public void showNum() {
		super.showNum();
		System.out.println("��ʾ��������");
		System.out.println("��ʾͷ��");
	}
}
public class demo05 {
	public static void main(String[] args) {
		NewPhone np = new NewPhone();
		np.call();
		np.showNum();
		
	}

}
