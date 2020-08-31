package day08String¿‡;

public class demo05 {
	public static void main(String[] args) {
		int[] arr= {1,2,3};
		String s = arrayToString(arr);
		System.out.println("s:"+s);
	}
	public static String arrayToString(int[] arr) {
		String s = new String("[");
		
		for(int x=0;x<arr.length;x++) {
			if (x==arr.length-1) {
				s=s.concat(arr[x]+"]");
			}
			else {
				s=s.concat(arr[x]+"#");
			}
		}
		return s;
		
	}

}
