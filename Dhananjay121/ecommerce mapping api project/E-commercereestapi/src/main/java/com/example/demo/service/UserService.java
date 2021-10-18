package com.example.demo.service;

import java.util.ArrayList;

import com.example.demo.model.User;

public interface UserService {

	//Adding User
	User addUser(User user);
	
	//List of users
	ArrayList<User> listOfUser();
	
	//Update user details
	User updateUser(User user);
	
	//Delete user details by id
	void deleteUserById(Integer id);
}