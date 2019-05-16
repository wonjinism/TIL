package io.zerone.myapp0114.VO;

public class Comment {
	private int commentseq;
	private int boardseq;
	private String id;
	private String comments;
	private String indate;
	private int parentseq;

	public Comment() {
	}

	public Comment(int commentseq, int boardseq, String id, String comments, String indate, int parentseq) {
		this.commentseq = commentseq;
		this.boardseq = boardseq;
		this.id = id;
		this.comments = comments;
		this.indate = indate;
		this.parentseq = parentseq;
	}

	public int getCommentseq() {
		return commentseq;
	}

	public void setCommentseq(int commentseq) {
		this.commentseq = commentseq;
	}

	public int getBoardseq() {
		return boardseq;
	}

	public void setBoardseq(int boardseq) {
		this.boardseq = boardseq;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getIndate() {
		return indate;
	}

	public void setIndate(String indate) {
		this.indate = indate;
	}

	public int getParentseq() {
		return parentseq;
	}

	public void setParentseq(int parentseq) {
		this.parentseq = parentseq;
	}

	@Override
	public String toString() {
		return "Comment [commentseq=" + commentseq + ", boardseq=" + boardseq + ", id=" + id + ", comments=" + comments
				+ ", indate=" + indate + ", parentseq=" + parentseq + "]";
	}

}
