package day08String类;

import java.util.Arrays;

public class demo10 {
	public static void main(String[] args) {
		// 定义int 数组
		int[] arr = {24, 7, 5, 48, 4, 46, 35, 11, 6, 2};
		System.out.println("排序前:"+ Arrays.toString(arr)); // 排序前:[24, 7, 5, 48, 4, 46, 35, 11, 6,
	
		// 升序排序
		Arrays.sort(arr);
		System.out.println("排序后:"+ Arrays.toString(arr));// 排序后:[2, 4, 5, 6, 7, 11, 24, 35, 46,
		
		}
}
