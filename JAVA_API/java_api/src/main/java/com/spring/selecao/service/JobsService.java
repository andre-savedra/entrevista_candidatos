package com.spring.selecao.service;

import java.util.List;

import com.spring.selecao.model.Jobs;

public interface JobsService {
	public Jobs findJobsById(Long id);
	public List<Jobs> findAllJobs();
	public void saveJob(Jobs job);
}
