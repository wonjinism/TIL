package step01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestFileUtil {
	public static void main(String[] args) {
		String path = "c://java-io//iotest/step2//filetest//test.txt";
		File f = new File(path);
//		System.out.println(f.getParentFile()); // c:\java-io\iotest\step2\filetest

		if (f.exists() == false) {
			// 파일의 상위 디렉토리 객체를 얻어오는 메서드를 호출하여 객체를 리턴 받는다.
			File dir = f.getParentFile();
			// 디렉토리 생성 메서드를 이용해 디렉토리를 만듦
			dir.mkdirs();
			// 파일을 생성
			try {
				f.createNewFile();				
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println(f.getPath() + "가 존재하여 생성하지 않습니다.");
		}
		////////////////////////////////////////////////////////
		String path2 = "c://java-io//iotest/step3//filetest//test2.txt";
		File f2 = new File(path2);
		// path를 확인해서 디렉토리가 없으면 생성
		f2.getParentFile().mkdirs();
		// FileWriter를 이용해 파일이 없으면 파일 생성
		try {
			// FileWriter를 이용해 파일이 없으면 파일생성
//			FileWriter fw = new FileWriter(f2); // boolean 없으면 초기화
			FileWriter fw = new FileWriter(f2, true);
			PrintWriter pw = new PrintWriter(fw);
			pw.println("사이고마데감바테구다사이!");
			pw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		///////////////////////////////////////
		try {
			FileReader fr = new FileReader(path2);
			BufferedReader br = new BufferedReader(fr);
			String str = br.readLine();
			while (str != null) {
				System.out.println(str);
				str = br.readLine();
			}
			System.out.println("읽기 성공!");
			fr.close();
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}