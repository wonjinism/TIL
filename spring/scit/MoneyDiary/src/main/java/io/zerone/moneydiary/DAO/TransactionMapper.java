package io.zerone.moneydiary.DAO;

import java.util.ArrayList;

import io.zerone.moneydiary.VO.Transaction;

public interface TransactionMapper {
	public int insertTransaction(Transaction transaction);
	public Transaction selectTransaction(int accountSeq);
	public ArrayList<Transaction> selectTransactionList();
	public int deleteTransaction(int accountSeq);
}
