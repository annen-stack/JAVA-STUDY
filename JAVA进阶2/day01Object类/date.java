package day01Object��;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class date {
	public static void main(String[] args) {
		System.out.println(new Date());
		
		Date date = new Date();
		DateFormat df = new SimpleDateFormat("yyyy��MM��dd��");
		String str = df.format(date);
		System.out.println(str);
	}

}
