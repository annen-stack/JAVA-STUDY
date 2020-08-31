package day02·ºÐÍ;

public class GenericClassDemo {
	public static void main(String[] args) {
		MyGenericClass<String> my = new MyGenericClass<String>();
	
		my.setMVP("HISA");
		String mvp = my.getMVP();
		System.out.println(mvp);
		
		MyGenericClass<Integer> m = new MyGenericClass<Integer>();
		m.setMVP(123);
		Integer s = m.getMVP();
		System.out.println(s);
	}
	
	

}
