package io.zerone.simplechat.DAO;

import java.util.ArrayList;

import io.zerone.simplechat.VO.Chat;
import io.zerone.simplechat.VO.Room;

public interface ChatMapper {
	public ArrayList<Room> selectRoomList();
	public int insertRoom(Room room);
	public Room selectRoom(int room_seq);
	public ArrayList<Chat> selectChatList(int room_seq);
	public int insertChat(Chat chat);
}
