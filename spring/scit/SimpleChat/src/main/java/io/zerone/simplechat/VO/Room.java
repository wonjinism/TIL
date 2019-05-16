package io.zerone.simplechat.VO;

public class Room {
	private int room_seq;
	private String user_id;
	private String name;
	private String indate;
	private int user_count;

	public Room() {
	}

	public Room(int room_seq, String user_id, String name, String indate, int user_count) {
		this.room_seq = room_seq;
		this.user_id = user_id;
		this.name = name;
		this.indate = indate;
		this.user_count = user_count;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIndate() {
		return indate;
	}

	public void setIndate(String indate) {
		this.indate = indate;
	}

	public int getUser_count() {
		return user_count;
	}

	public void setUser_count(int user_count) {
		this.user_count = user_count;
	}

	@Override
	public String toString() {
		return "Room [room_seq=" + room_seq + ", user_id=" + user_id + ", name=" + name + ", indate=" + indate
				+ ", user_count=" + user_count + "]";
	}

}
