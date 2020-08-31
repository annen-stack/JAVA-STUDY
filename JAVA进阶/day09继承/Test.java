package day09¼Ì³Ð;

import java.util.Scanner;
import java.util.ArrayList;
public class Test {
	

	public static void main(String[] args) {
		QunZhu qz = new QunZhu("ÈºÖ÷",200);
		

		int money = 100;

		int count=20;
		
		ArrayList<Double> sendList = qz.send(money,count);
		Member m = new Member();
		Member m2 = new Member();
		Member m3 = new Member();
		
		m.openHongbao(sendList);
		System.out.println(m.getLeftMoney());
		m2.openHongbao(sendList);
		System.out.println(m2.getLeftMoney());
		m3.openHongbao(sendList);
		System.out.println(m3.getLeftMoney());
		
		qz.show();
		m.show();
		m2.show();
		m3.show();
	}

}
