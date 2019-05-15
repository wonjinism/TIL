package step03;

public class AudioBook extends Book {
	private int playTime;

	public AudioBook(String bookId, String name, String summary, int playTime) {
		super(bookId, name, summary);
		this.playTime = playTime;
	}

	public int getPlayTime() {
		return playTime;
	}

	public void setPlayTime(int playTime) {
		this.playTime = playTime;
	}
	@Override
	public String toString() {
		return super.toString() + ", 재생시간 = " + playTime;
	}
	
}
