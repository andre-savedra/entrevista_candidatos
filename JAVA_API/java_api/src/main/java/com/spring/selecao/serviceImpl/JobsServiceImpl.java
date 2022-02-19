package com.spring.selecao.serviceImpl;

import java.util.List;

import javax.persistence.SecondaryTable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.selecao.model.Jobs;
import com.spring.selecao.repository.JobsRepository;
import com.spring.selecao.service.JobsService;

@Service
public class JobsServiceImpl implements JobsService{

	@Autowired
	JobsRepository jobRepository;

	@Override
	public Jobs findJobsById(Long id) {		
		return jobRepository.findById(id).get();
	}

	@Override
	public List<Jobs> findAllJobs() {
		return jobRepository.findAll();
	}

	@Override
	public void saveJob(Jobs job) {
		jobRepository.save(job);		
	}
	
}
