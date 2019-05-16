package io.zerone.moneydiary.DAO;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import io.zerone.moneydiary.VO.Transaction;

@Repository
public class TransactionDAO {
	
	@Autowired
	SqlSession session;
	
	public int insertTransaction(Transaction transaction) {
		int result = 0;
		TransactionMapper mapper = session.getMapper(TransactionMapper.class);
		try {
			result = mapper.insertTransaction(transaction);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return result;
		}
	}
	
	public ArrayList<Transaction> selectTransactionList(){
		ArrayList<Transaction> transactionList = null;
		TransactionMapper mapper = session.getMapper(TransactionMapper.class);
		try {
			transactionList = mapper.selectTransactionList();
			return transactionList;
		} catch (Exception e) {
			e.printStackTrace();
			return transactionList;
		}
	}
	
	public Transaction selectTransaction(int accountSeq){
		Transaction transaction = null;
		TransactionMapper mapper = session.getMapper(TransactionMapper.class);
		try {
			transaction = mapper.selectTransaction(accountSeq);
			return transaction;
		} catch (Exception e) {
			e.printStackTrace();
			return transaction;
		}
	}
	
	public int deleteTransaction(int accountSeq) {
		int result = 0;
		TransactionMapper mapper = session.getMapper(TransactionMapper.class);
		try {
			result = mapper.deleteTransaction(accountSeq);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return result;
		}
	}
	
}
