package com.spring.selecao.service;

import java.util.List;

import com.spring.selecao.model.Status;

public interface StatusService {
	public Status findStatusById(Long id);
	public List<Status> findAllStatus();
	public void saveStatus(Status status);

}
