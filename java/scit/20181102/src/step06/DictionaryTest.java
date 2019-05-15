package step06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Scanner;

public class DictionaryTest {
	
	private static Scanner input = new Scanner(System.in);
	private static DictionaryManager dm = new DictionaryManager();

	public static void main(String[] args) {
		// 역직렬화로 파일을 HashMap에 입력
		while(true){
			displayMainMenu();
			System.out.print("메뉴선택: ");
			int num = input.nextInt();
			switch(num){
				case 1: addWordMenu();
					break;
				case 2: searchWordMenu();
					break;
				case 3: deleteWordMenu();
					break; 
				case 4: 
					dm.save();
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				default: System.out.println("메뉴선택 오류!");
			}//switch
		}//while
	}
	
	public static void displayMainMenu(){
		System.out.println("[---Java Dictionary---]");
		System.out.println("1. 사전등록");
		System.out.println("2. 단어검색");
		System.out.println("3. 단어삭제");
		System.out.println("4. 종료");
		System.out.println("-----------------------");
	}
	
	public static void addWordMenu(){
		input.nextLine();
		System.out.print("단어입력: ");
		String word = input.nextLine();
		System.out.print("설명글 입력: ");
		String description = input.nextLine();
		dm.addWord(word, description);
	}
	
	public static void searchWordMenu(){
		input.nextLine();
		System.out.print("검색단어입력: ");
		String word = input.nextLine();
		String description = dm.searchWord(word);
		System.out.println("-- 검색결과 --");
		System.out.println(description);		
	}
	
	public static void deleteWordMenu(){
		input.nextLine();
		System.out.print("삭제단어입력: ");
		String word = input.nextLine();
		boolean result = dm.deleteWord(word);
		if(result) 
			System.out.println("삭제되었습니다.");
		else
			System.out.println("등록되지 않은 단어입니다.");
	}
}