package io.zerone.simplechat.VO;

public class Chat {
	private int chat_seq;
	private int room_seq;
	private String user_id;
	private String message;
	private String indate;

	public Chat() {
	}

	public Chat(int chat_seq, int room_seq, String user_id, String message, String indate) {
		this.chat_seq = chat_seq;
		this.room_seq = room_seq;
		this.user_id = user_id;
		this.message = message;
		this.indate = indate;
	}

	public int getChat_seq() {
		return chat_seq;
	}

	public void setChat_seq(int chat_seq) {
		this.chat_seq = chat_seq;
	}

	public int getRoom_seq() {
		return room_seq;
	}

	public void setRoom_seq(int room_seq) {
		this.room_seq = room_seq;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getIndate() {
		return indate;
	}

	public void setIndate(String indate) {
		this.indate = indate;
	}

	@Override
	public String toString() {
		return "Chat [chat_seq=" + chat_seq + ", room_seq=" + room_seq + ", user_id=" + user_id + ", message=" + message
				+ ", indate=" + indate + "]";
	}

}
