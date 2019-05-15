/*
 * 입력 받은 문자열에서 동일한 문자를 카운트하여 출력
 * 예) 가가가bbbb가cc# 입력 시
 * 		가4b4c2#1 출력
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class CharCounter {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("텍스트 입력 : ");
		String input = sc.nextLine();
		
		HashMap<String, Integer> charMap = new HashMap<>();
		for (int i = 0; i < input.length(); i++) {
			String character = Character.toString(input.charAt(i));
			System.out.println(character);
			int charCount = 0;
			if(charMap.containsKey(character)) {
				charCount = charMap.get(character);
				System.out.println(charCount);
			}
			charMap.put(character, charCount + 1);
		}

		// 풀이
		String[] arr = input.split("");
		LinkedList<String> list = new LinkedList<>(Arrays.asList(arr));
		System.out.println(list.toString());
		HashSet<String> set = new HashSet<>(list);
		System.out.println(set.toString()); // 이때 어떤 기준으로 set이 정렬되는거지?
		StringBuffer sb = new StringBuffer();
		
		for(String s : set) {
			int count = 0;
			while(true) {
				if(!list.remove(s)) {
					break;
				}
				count++;
			}
			sb.append(s);
			sb.append(count);
		}
		System.out.println(sb.toString());
	}
}
