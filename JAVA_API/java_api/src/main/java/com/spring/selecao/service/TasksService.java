package com.spring.selecao.service;

import java.util.List;

import com.spring.selecao.model.Tasks;

public interface TasksService {
	public Tasks findTasksById(Long id);
	public List<Tasks> findAllTasks();
	public void saveTask(Tasks task);
}
