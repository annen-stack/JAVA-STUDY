package day08String��;

//split(String regex) �������ַ������ո�����regex�����򣩲��Ϊ�ַ������顣
public class demo04 {
	public static void main(String[] args) {
		String s = "aa|bb|cc";
		String[] strArray = s.split("|"); // ["aa","bb","cc"]
		for(int x = 0; x < strArray.length; x++) {
		System.out.println(strArray[x]); // aa bb cc
		}
	}
}
