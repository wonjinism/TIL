/*
 * AbcdEf
 * AbcdE#
 * Abcd##
 * Abc###
 * Ab####
 * A#####
 * ######
 */

import java.util.Scanner;

public class TextHide {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("텍스트 입력 : ");
		String input = sc.nextLine();
		System.out.println("===========");
		
		// My answer
		for (int i = 1; i <= input.length(); i++) {
			String result = input.substring(0, input.length() - i);
			System.out.print(result);
			for (int j = 0; j < i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		System.out.println("===========");
		// Case 1
		StringBuffer sb = new StringBuffer(input);
		for (int i = sb.length() -1; i >= 0; i--) {
			sb.setCharAt(i, '#');
			System.out.println(sb.toString());
		}
		
		System.out.println("===========");
		// Case 2
		String[] arr = input.split("");
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = 0; j < arr.length; j++) {
				if(i > j) System.out.print(arr[j]);
				else System.out.print("#");
			}
			System.out.println();
		}
	}
	
}
