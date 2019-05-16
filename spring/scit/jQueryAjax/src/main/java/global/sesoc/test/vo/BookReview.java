package global.sesoc.test.vo;

public class BookReview {
	private int seq;
	private String name;
	private String regdate;
	private String review;
	public BookReview() {
		// TODO Auto-generated constructor stub
	}
	public BookReview(int seq, String name,String regdate, String review) {
		super();
		this.seq = seq;
		this.name = name;
		this.regdate = regdate;
		this.review = review;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	@Override
	public String toString() {
		return "BookReview [seq=" + seq + ", name=" + name + ", regdate=" + regdate
				+ ", review=" + review + "]";
	}
}
