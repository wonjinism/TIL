package step03;

public class TestStringEx {
	public static void main(String[] args) {
		FileMgr mgr = new FileMgr();
		String fa[] = {
				"삐삐.mp3",
				"a.txt",
				"오리날다.mp3",
				"야구동영상.avi",
			};
		mgr.printFileType("mp3", fa);
	}
}
