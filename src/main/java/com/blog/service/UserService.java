package com.blog.service;

import java.util.List;

import com.blog.payloads.UserDto;

public interface UserService {

	UserDto createUser(UserDto user);

	UserDto registerNewUser(UserDto user);
	
	UserDto updateUser(UserDto user , Integer userId);
	
	UserDto getUserById(Integer userId);
	
	List<UserDto>  getAllUsers();
	
	void deleteUser(Integer userId);
	

}
