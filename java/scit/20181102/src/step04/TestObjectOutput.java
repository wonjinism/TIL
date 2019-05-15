package step04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestObjectOutput {
	/*
	 * 객체 직렬화 해서 파일로 저장하는 예제
	 */
	public static void main(String[] args) {
		String path = "C:\\java-scm\\iotest\\objecttest\\person.ser";
		File f = new File(path);
		f.getParentFile().mkdirs();
		try {
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			PersonVO pvo = new PersonVO("김지훈", "kim1234");
			oos.writeObject(pvo);
			oos.close();
			fos.close();
			System.out.println("객체 직렬화 성공!!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
