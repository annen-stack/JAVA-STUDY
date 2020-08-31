package day08String类;

public class demo03 {
	public static void main(String[] args) {
		//创建字符串对象
		String s = "abcde";
		// char[] toCharArray():把字符串转换为字符数组
		char[] chs = s.toCharArray();
		for(int x = 0; x < chs.length; x++) {
			System.out.println(chs[x]);
		}
		System.out.println("‐‐‐‐‐‐‐‐‐‐‐");
		// byte[] getBytes ():把字符串转换为字节数组
		byte[] bytes = s.getBytes();
		for(int x = 0; x < bytes.length; x++) {
			System.out.println(bytes[x]);
		}
		System.out.println("‐‐‐‐‐‐‐‐‐‐‐");
		
		String str = "itcast itheima";
		String replace = str.replace("it", "IT");
		System.out.println(replace); // ITcast ITheima
		System.out.println("‐‐‐‐‐‐‐‐‐‐‐");
		}



}
