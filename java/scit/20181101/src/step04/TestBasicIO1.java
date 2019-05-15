package step04;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestBasicIO1 {
	public static void main(String[] args) {
		/*
		 * 파일을 생성하고 기록하는 기본예제
		 */
		try {
			// file에 연결되는 16bit짜리 출력 스트림 - node stream 계열
			FileWriter fw = new FileWriter("E:\\trunk\\files\\outer.txt"); // 폴더는 만들어져 있어야 함.
			System.out.println("FileWriter 생성!");
			// 프로세스 스트림 생성자에 노드 스트림 객체를 파라미터로 넣는다.
			PrintWriter pw = new PrintWriter(fw);			
			pw.println("우사기데고자이마스!");
			pw.println("우사기데고자이마스스!!");
			pw.close();
			fw.close();
		} catch (IOException e) {
			System.out.println("IOException 이다다다다");
			e.printStackTrace();
		}
	}
}