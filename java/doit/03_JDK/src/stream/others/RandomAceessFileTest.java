package stream.others;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAceessFileTest {
	public static void main(String[] args) throws IOException {
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		rf.writeInt(100); // int 4 바이트
		System.out.println("파일 포인터 위치: " + rf.getFilePointer());
		rf.writeDouble(3.14); // double 8 바이트
		System.out.println("파일 포인터 위치: " + rf.getFilePointer());
		rf.writeUTF("안녕하세요"); // 수정된 UTF-8 사용 한글(3바이트) * 5 + null 문자(2바이트) = 17
		System.out.println("파일 포인터 위치: " + rf.getFilePointer());
		
		rf.seek(0);
		System.out.println("파일 포인터 위치: " + rf.getFilePointer());
		
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println("파일 포인터 위치: " + rf.getFilePointer());
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
	}
}
