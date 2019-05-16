package io.zerone.simplechat;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import io.zerone.simplechat.DAO.ChatDAO;
import io.zerone.simplechat.VO.Chat;
import io.zerone.simplechat.VO.Room;

@Controller
public class ChatController {

	@Autowired
	ChatDAO dao;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String listRoom(Model model) {
		ArrayList<Room> roomList = null;
		roomList = dao.selectRoomList();
		System.out.println(roomList); ////
		model.addAttribute("roomList", roomList);
		return "list";
	}

	@RequestMapping(value = "/createRoom", method = RequestMethod.GET)
	public String createRoom(Room room, HttpSession session) {
		String user_id = (String) session.getAttribute("user_id");
		room.setUser_id(user_id);
		dao.insertRoom(room);
		// 시퀀스 번호를 받아옴
		return "redirect:/chat?chatNum=" + room.getRoom_seq();
	}

	@RequestMapping(value = "/chat", method = RequestMethod.GET)
	public String chat(int chatNum, Model model) {
		Room room = dao.selectRoom(chatNum);
		model.addAttribute("room", room);
		ArrayList<Chat> chatList = dao.selectChatList(chatNum);
		model.addAttribute("chatList", chatList);
		return "chat";
	}

	@RequestMapping(value = "/message", method = RequestMethod.POST)
	public String message(Chat chat, HttpSession session) {
		String user_id = (String) session.getAttribute("user_id");
		chat.setUser_id(user_id);
		dao.insertChat(chat);
		return "redirect:/chat?chatNum=" + chat.getRoom_seq();
	}
	
	@RequestMapping(value = "/chatList", method = RequestMethod.GET)
	public @ResponseBody ArrayList<Chat> chatList(int room_seq) {
		ArrayList<Chat> chatList = dao.selectChatList(room_seq);
		System.out.println(chatList); ////
		return chatList;
	}
}