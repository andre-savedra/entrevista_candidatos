package com.spring.selecao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.selecao.model.Jobs;

public interface JobsRepository extends JpaRepository<Jobs, Long>{

}
