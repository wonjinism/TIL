package io.zerone.todolist.VO;

public class Todo {
	public int id;
	public String title;
	public String name;
	public int seq;
	public String type;
	public String regdate;

	public Todo() {
	}

	public Todo(int id, String title, String name, int seq, String type, String regdate) {
		this.id = id;
		this.title = title;
		this.name = name;
		this.seq = seq;
		this.type = type;
		this.regdate = regdate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", title=" + title + ", name=" + name + ", seq=" + seq + ", type=" + type
				+ ", regdate=" + regdate + "]";
	}

}
