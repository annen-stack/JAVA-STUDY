package day10��̬;

public class Mouse implements USB{

	@Override
	public void open() {
		System.out.println("��꿪���������һ��");
		
	}

	@Override
	public void close() {
		System.out.println("���رգ����Ϩ��");
		
	}
	
	public void click() {
		System.out.println("��굥��");
	}

}
