package io.zerone.moneydiary.DAO;

import io.zerone.moneydiary.VO.Account;

public interface AccountMapper {
	public int insertAccount(Account account);
	public Account selectAccount(Account account);
}
