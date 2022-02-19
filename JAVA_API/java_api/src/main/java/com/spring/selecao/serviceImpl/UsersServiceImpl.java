package com.spring.selecao.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.selecao.model.Users;
import com.spring.selecao.repository.UsersRepository;
import com.spring.selecao.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService {
	
	@Autowired
	UsersRepository userRepository;

	@Override
	public Users findUsersById(Long id) {
		return userRepository.findById(id).get();
	}

	@Override
	public List<Users> findAllUsers() {		
		return userRepository.findAll();
	}

	@Override
	public void saveUser(Users user) {		
		userRepository.save(user);
	}
	
	
}
