package com.spring.selecao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.selecao.model.Tasks;

public interface TasksRepository extends JpaRepository<Tasks, Long>{

}
