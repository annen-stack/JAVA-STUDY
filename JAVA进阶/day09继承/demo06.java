package day09�̳�;

/*
 * 1.. ���췽����������������һ�µġ������������޷��̳и��๹�췽����
 * 2. ���췽���������ǳ�ʼ����Ա�����ġ���������ĳ�ʼ�������У�������ִ�и���ĳ�ʼ������������Ĺ�
�췽����Ĭ����һ�� super() ����ʾ���ø���Ĺ��췽��
 */

class Fu0{
	private int n;
	Fu0(){//���๹�췽��
		System.out.println("Fu");
	}
}

class Zi0 extends Fu0{
	Zi0(){
		super();
		System.out.println("Zi()");
	}
}
public class demo06 {
	public static void main(String args[]) {
		Zi0 zi = new Zi0();
	}

}
