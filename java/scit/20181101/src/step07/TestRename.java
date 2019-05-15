package step07;

import java.io.File;

public class TestRename {
	public static void main(String[] args) {
		String org = "C:\\iotest2\\newDir\\test\\aa.txt";
		String dest = "C:\\iotest2\\newDir\\test2\\aa.txt";
		File orgFile = new File(org);
		File destFile = new File(dest);
		System.out.println(orgFile.renameTo(destFile));
	}
}