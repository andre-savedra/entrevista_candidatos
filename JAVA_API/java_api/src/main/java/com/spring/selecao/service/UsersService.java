package com.spring.selecao.service;

import java.util.List;

import com.spring.selecao.model.Users;

public interface UsersService {
	public Users findUsersById(Long id);
	public List<Users> findAllUsers();
	public void saveUser(Users user);
}
