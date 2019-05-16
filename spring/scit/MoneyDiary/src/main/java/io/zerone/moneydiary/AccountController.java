package io.zerone.moneydiary;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import io.zerone.moneydiary.DAO.AccountDAO;
import io.zerone.moneydiary.VO.Account;

@Controller
public class AccountController {
	
	@Autowired
	AccountDAO dao;
	
	@RequestMapping(value = "/newAccount", method = RequestMethod.POST)
	public @ResponseBody int insertAccount(Account account) {
		int result = dao.insertAccount(account);
		return result;
	}
	
	@RequestMapping(value = "/checkAccount", method = RequestMethod.POST)
	public @ResponseBody int selectAccount(Account account, HttpSession session) {
		Account result = dao.selectAccount(account);
		/*
		 * 0 : ID가 맞지 않음
		 * -1 : ID는 맞지만 PW가 오류
		 * 1 : ID와 PW 모두 맞음
		 */
		if(result != null) {
			if(result.getPw().equals(account.getPw())) {
				session.setAttribute("id", account.getId());
				return 1; // 비밀 번호까지 맞음
			}else {
				return -1; // 비밀 번호 오류
			}
		}else {
			return 0; // 계정이 맞지 않음
		}
	}
	
}
