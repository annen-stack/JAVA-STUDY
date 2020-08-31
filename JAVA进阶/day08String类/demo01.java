package day08String类;
/*
 * // 无参构造
String str = new String（）；
// 通过字符数组构造
char chars[] = {'a', 'b', 'c'};
String str2 = new String(chars);
// 通过字节数组构造
byte bytes[] = { 97, 98, 99 };
String str3 = new String(bytes);
 */
public class demo01 {
	public static void main(String[] args) {
		// 创建字符串对象
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "HELLO";
		// boolean equals(Object obj):比较字符串的内容是否相同
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1.equals(s3)); // false
		System.out.println("‐‐‐‐‐‐‐‐‐‐‐");
		//boolean equalsIgnoreCase(String str):比较字符串的内容是否相同,忽略大小写
		System.out.println(s1.equalsIgnoreCase(s2)); // true
		System.out.println(s1.equalsIgnoreCase(s3)); // true
		System.out.println("‐‐‐‐‐‐‐‐‐‐‐");
		}
}
