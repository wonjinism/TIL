package io.zerone.simplechat.DAO;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import io.zerone.simplechat.VO.Chat;
import io.zerone.simplechat.VO.Room;

@Repository
public class ChatDAO {

	@Autowired
	SqlSession session;
	
	public ArrayList<Room> selectRoomList(){
		ChatMapper mapper = session.getMapper(ChatMapper.class);
		ArrayList<Room> roomList = null;
		try {
			roomList = mapper.selectRoomList();
		} catch (Exception e) {
			e.printStackTrace();
			return roomList;
		}
		return roomList;
	}
	
	public int insertRoom(Room room) {
		int result = 0;
		ChatMapper mapper = session.getMapper(ChatMapper.class);
		try {
			mapper.insertRoom(room);
		} catch (Exception e) {
			e.printStackTrace();
			return result;
		}
		
		return result;
	}
	
	public Room selectRoom(int room_seq) {
		Room room = null;
		ChatMapper mapper = session.getMapper(ChatMapper.class);
		
		try {
			room = mapper.selectRoom(room_seq);
		} catch (Exception e) {
			e.printStackTrace();
			return room;
		}
		return room;
	}
	
	public int insertChat(Chat chat) {
		int result = 0;
		ChatMapper mapper = session.getMapper(ChatMapper.class);
		try {
			result = mapper.insertChat(chat);
		} catch (Exception e) {
			e.printStackTrace();
			return result;
		}
		return result;
	}
	
	public ArrayList<Chat> selectChatList(int room_seq){
		ArrayList<Chat> chatList = null;
		ChatMapper mapper = session.getMapper(ChatMapper.class);
		try {
			chatList = mapper.selectChatList(room_seq);
		} catch (Exception e) {
			e.printStackTrace();
			return chatList;
		}
		return chatList;
	}
	
}
