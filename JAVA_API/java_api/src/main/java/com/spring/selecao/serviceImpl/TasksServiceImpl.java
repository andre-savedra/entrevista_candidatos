package com.spring.selecao.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.selecao.model.Tasks;
import com.spring.selecao.repository.TasksRepository;
import com.spring.selecao.service.TasksService;

@Service
public class TasksServiceImpl implements TasksService{

	@Autowired
	TasksRepository tasksRepository;

	@Override
	public Tasks findTasksById(Long id) {
		return tasksRepository.findById(id).get();
	}

	@Override
	public List<Tasks> findAllTasks() {		
		return tasksRepository.findAll();
	}

	@Override
	public void saveTask(Tasks task) {		
		tasksRepository.save(task);
	}
	
}
