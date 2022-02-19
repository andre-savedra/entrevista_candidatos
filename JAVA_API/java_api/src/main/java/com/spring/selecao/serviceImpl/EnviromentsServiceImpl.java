package com.spring.selecao.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.selecao.model.Enviroments;
import com.spring.selecao.repository.EnviromentRepository;
import com.spring.selecao.service.EnviromentService;

@Service
public class EnviromentsServiceImpl implements EnviromentService {
	
	@Autowired
	EnviromentRepository enviromentRepository;

	@Override
	public Enviroments findEnviromentById(Long id) {		
		return enviromentRepository.findById(id).get();
	}

	@Override
	public List<Enviroments> findAllEnviroments() {		
		return enviromentRepository.findAll();
	}

	@Override
	public void saveEnviroments(Enviroments enviroment) {
		enviromentRepository.save(enviroment);
		
	}

}
