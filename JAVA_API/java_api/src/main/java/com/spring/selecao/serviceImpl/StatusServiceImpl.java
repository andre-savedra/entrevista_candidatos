package com.spring.selecao.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.selecao.model.Status;
import com.spring.selecao.repository.StatusRepository;
import com.spring.selecao.service.StatusService;

@Service
public class StatusServiceImpl implements StatusService{

	@Override
	public Status findStatusById(Long id) {
		return stastusRepository.findById(id).get();
	}

	@Override
	public List<Status> findAllStatus() {		
		return stastusRepository.findAll();
	}

	@Override
	public void saveStatus(Status status) {
		stastusRepository.save(status);
		
	}

	@Autowired
	StatusRepository stastusRepository;
}
