package day02·ºÐÍ;

import java.util.ArrayList;
import java.util.Collections;

public class Poker {
	public static void main(String[] args) {
		ArrayList<String> pokerBox = new ArrayList<String>();
		ArrayList<String> colors = new ArrayList<String>();
		ArrayList<String> numbers = new ArrayList<String>();
		
		colors.add("1");
		colors.add("2");
		colors.add("3");
		colors.add("4");
		
		for(int i=2;i<=10;i++) {
			numbers.add(i+"");
		}
		
		numbers.add("J");
		numbers.add("Q");
		numbers.add("K");
		numbers.add("A");
		
		
		for(String color: colors) {
			for(String number:numbers) {
				String card = color+number;
				pokerBox.add(card);
			}
		}
		//Ï´ÅÆ
		Collections.shuffle(pokerBox);
		
		ArrayList<String> player1 = new ArrayList<String>();
		ArrayList<String> player2 = new ArrayList<String>();
		ArrayList<String> player3 = new ArrayList<String>();
		
		ArrayList<String> dipai = new ArrayList<String>();
		
		
		for(int i=0;i<pokerBox.size();i++) {
			String card = pokerBox.get(i);
			if(i>51) {
				dipai.add(card);
			}
			else {
				if(i%3==0) {
					player1.add(card);
				}
				else if(i%3==1) {
					player2.add(card);
				}
				else {
					player3.add(card);
				}
			}
		}
		
	}

}
