package com.spring.selecao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.selecao.model.Users;

public interface UsersRepository extends JpaRepository<Users, Long>{

}
