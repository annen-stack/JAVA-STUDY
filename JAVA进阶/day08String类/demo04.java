package day08String类;

//split(String regex) ：将此字符串按照给定的regex（规则）拆分为字符串数组。
public class demo04 {
	public static void main(String[] args) {
		String s = "aa|bb|cc";
		String[] strArray = s.split("|"); // ["aa","bb","cc"]
		for(int x = 0; x < strArray.length; x++) {
		System.out.println(strArray[x]); // aa bb cc
		}
	}
}
