package day09�̳�;

/*
 * �Ӹ����г�����ͬ���ĳ�Ա����ʱ������������Ҫ���ʸ����з�˽�г�Ա����ʱ����Ҫʹ�� super �ؼ��֣�����
�����Ա������������֮ǰѧ���� this 
 */

class Fu{
	int num=5;
}
class Zi extends Fu{
	int num=6;
	public void show() {
		System.out.println("Fu num="+super.num);
		System.out.println("Zi num2="+this.num);
	}
}

public class demo03 {
	public static void main(String[] args) {
		Zi z = new Zi();
		z.show();
	}
}
