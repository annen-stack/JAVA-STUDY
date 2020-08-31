package day01Object¿‡;

public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();
		System.out.println(sb1);
		sb1.append("hello").append("world");
		String str = sb1.toString();
		System.out.println(str);
		
		StringBuilder sb2 = new StringBuilder("itcast");
		System.out.println(sb2);
		
		
		int num=Integer.parseInt("100");
		float d = Float.parseFloat("121.33");
	}

}
