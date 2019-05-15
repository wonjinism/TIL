package step05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import step04.PersonVO;

public class TestObjectInput {
	/*
	 * 파일로부터 객체를 역직렬화하여 읽어오는 예제
	 */
	public static void main(String[] args) {
		String path = "C:\\java-scm\\iotest\\objecttest\\person.ser";
		try {
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			PersonVO pvo = (PersonVO) ois.readObject();
			System.out.println("역직렬화 성공~!\n" + pvo);
			ois.close();
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
