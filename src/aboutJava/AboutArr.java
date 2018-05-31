package aboutJava;

import java.util.Arrays;


public class AboutArr {
	
	
	//需求：裁剪数组

	public static void main(String[] args) {
		
		char[] char1 = {'a','b','c'};
		char[] char2 = char1;
		char2[1] = 'x';
		
		System.out.println(char2);
		
		int[] arr = {1,2,3,4,5};
		int[] arr1 = Arrays.copyOf(arr, 2);
		int[] arr2 = Arrays.copyOfRange(arr, 1, (arr.length-1));
		
		for (int i : arr1) {
			System.out.println(i);
		}
		for (int i : arr2) {
			System.out.println(i);
		}
	}

}
