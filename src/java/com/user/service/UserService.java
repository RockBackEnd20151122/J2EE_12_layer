package com.user.service;

import com.user.dto.UserDto;

public interface UserService {

	void addUser(UserDto user);
	
	String judgeCanLogin( UserDto userDto);
	
	UserDto getUserByUserName( String userName );
	
}
