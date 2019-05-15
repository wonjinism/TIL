package step06;

import java.io.File;
import java.io.IOException;

public class TestFile {
	public static void main(String[] args) {
		File dir = new File("c://iotest2//newDir//test");
		System.out.println(dir.mkdirs()); // 최하위 디렉토리까지 생성

		File nf = new File("c://iotest2//newDir//test//test.txt");
		try {
			System.out.println(nf.createNewFile()); // 파일생성 성공 여부 : true/false
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(nf.getName()); // 파일명
		System.out.println(nf.getPath()); // 파일명을 포함한 전체경로
		System.out.println(nf.getParent()); // 파일이 위치한 디렉토리만을 출력
		System.out.println(nf.isFile()); // 파일인가? true/false
		System.out.println(nf.isDirectory()); // 디렉토리인가? true/false
		System.out.println(dir.isDirectory());

		System.out.println(nf.canWrite()); // 쓰기권한 여부 true/false
		System.out.println(nf.canRead()); // 읽기권한 여부 true/false

		// 디렉토리에 있는 파일 및 디렉토리를 확인
		if (dir.isDirectory()) {
			String[] f = dir.list();
			for (int i = 0; i < f.length; i++) {
				System.out.println(f[i]);
			}
		}
		// file이면 앞에 file : , directory라면 dir : 을 붙여서 출력

		if (dir.isDirectory()) {
			File[] f = dir.listFiles();
			for (int i = 0; i < f.length; i++) {
				if (f[i].isFile()) {
					System.out.println("file : " + f[i].getName());
				} else if (f[i].isDirectory()) {
					System.out.println("dir : " + f[i].getName());
				}
			}
		}
	}
}
