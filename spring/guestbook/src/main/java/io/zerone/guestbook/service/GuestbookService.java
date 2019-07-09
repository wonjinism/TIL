package io.zerone.guestbook.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.zerone.guestbook.domain.Guestbook;
import io.zerone.guestbook.repository.GuestbookRepository;

@Service
public class GuestbookService {
	@Autowired
	private GuestbookRepository guestbookRepository;

	public List<Guestbook> getMessageList() {
		return guestbookRepository.findAll();
	}
	
	public void insertMessage(Guestbook guestbook) {
		guestbook.setRegDate(new Date());
		guestbookRepository.save(guestbook);
	}
	
	public void deleteMessage(Guestbook guestbook) {
		boolean result = guestbookRepository.remove(guestbook);
	}
}