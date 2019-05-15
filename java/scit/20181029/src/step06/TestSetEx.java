package step06;

public class TestSetEx {
	public static void main(String[] args) {
		WordMgr mgr = new WordMgr();
		String memo = "아이유 소녀시대 아이유 원더걸스 소녀시대 아이유";
		// 위에 작성된 단어의 종류를 출력
		mgr.printWordKing(memo);
	}
}
