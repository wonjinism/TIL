package io.zerone.moneydiary.DAO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import io.zerone.moneydiary.VO.Account;

@Repository
public class AccountDAO {
	
	@Autowired
	SqlSession session;
	
	public int insertAccount(Account account) {
		int result = 0;
		AccountMapper mapper = session.getMapper(AccountMapper.class);
		try {
			result = mapper.insertAccount(account);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return result;
		}
	}
	
	public Account selectAccount(Account account) {
		Account result = null;
		AccountMapper mapper = session.getMapper(AccountMapper.class);
		try {
			result = mapper.selectAccount(account);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return result;
		}
	}
}