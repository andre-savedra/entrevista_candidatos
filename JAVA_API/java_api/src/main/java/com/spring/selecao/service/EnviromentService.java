package com.spring.selecao.service;

import java.util.List;

import com.spring.selecao.model.Enviroments;

public interface EnviromentService {
	
	public Enviroments findEnviromentById(Long id);
	public List<Enviroments> findAllEnviroments();
	public void saveEnviroments(Enviroments enviroment);

}
