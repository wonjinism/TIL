package io.zerone.moneydiary;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import io.zerone.moneydiary.DAO.TransactionDAO;
import io.zerone.moneydiary.VO.Transaction;

@Controller
public class TransactionController {

	@Autowired
	TransactionDAO dao;
	
	@RequestMapping(value = "newTransaction", method = RequestMethod.POST)
	public @ResponseBody int insertTrasction(Transaction transaction) {
		System.out.println(transaction); ////
		int result = dao.insertTransaction(transaction);
		return result;
	}

	@RequestMapping(value = "transactionList", method = RequestMethod.GET)
	public @ResponseBody ArrayList<Transaction> selectTrasctionList() {
		ArrayList<Transaction> transactionList = dao.selectTransactionList();
		return transactionList;
	}
	
	@RequestMapping(value = "transactionDetails", method = RequestMethod.GET)
	public @ResponseBody Transaction selectTrasction(int accountSeq) {
		Transaction transaction = dao.selectTransaction(accountSeq);
		return transaction;
	}
	
	@RequestMapping(value = "deleteTransaction", method = RequestMethod.POST)
	public @ResponseBody int deleteTransaction(int accountSeq) {
		System.out.println(accountSeq); ////
		int result = dao.deleteTransaction(accountSeq);
		return result;
	}	
}
