package io.zerone.simplechat.DAO;

import io.zerone.simplechat.VO.User;

public interface UserMapper {
	public int insertUser(User user);
	public User selectUser(User user);
}
