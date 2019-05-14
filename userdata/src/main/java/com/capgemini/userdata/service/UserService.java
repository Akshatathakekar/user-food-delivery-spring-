package com.capgemini.userdata.service;

import org.springframework.stereotype.Service;

import com.capgemini.userdata.entity.Users;

public interface UserService {
	public Users addAllDetails(Users user);
	public Users loginUser(String email,String password);
	public Users getByEmail(String email);

}
