package step06;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Editor {
	public void read(String fileName) throws FileNotFoundException {
		FileReader fr = new FileReader(fileName);
		System.out.println(1);
	}
}
