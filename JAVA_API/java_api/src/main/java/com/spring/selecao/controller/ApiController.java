package com.spring.selecao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.selecao.model.Enviroments;
import com.spring.selecao.model.Jobs;
import com.spring.selecao.model.Status;
import com.spring.selecao.model.Tasks;
import com.spring.selecao.model.Users;
import com.spring.selecao.service.EnviromentService;
import com.spring.selecao.service.JobsService;
import com.spring.selecao.service.StatusService;
import com.spring.selecao.service.TasksService;
import com.spring.selecao.service.UsersService;

@Controller
public class ApiController {

	@Autowired
	EnviromentService enviroments;
	
	@Autowired
	JobsService jobs;
	
	@Autowired
	StatusService status;
	
	@Autowired
	TasksService tasks;
	
	@Autowired
	UsersService user;
	

	@ResponseBody
	@GetMapping(value = "/task",  produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Tasks> getTasks() {

		return tasks.findAllTasks();		
	}
	
	@ResponseBody
	@PostMapping(value = "/task", consumes = "application/json", produces = MediaType.APPLICATION_JSON_VALUE)
	public String postTasks(@RequestBody Tasks task) {

		tasks.saveTask(task);
		return "ok";
	}
	
	
	
	@ResponseBody
	@GetMapping(value = "/jobs",  produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Jobs> getJobs() {

		return jobs.findAllJobs();		
	}
	
	@ResponseBody
	@PostMapping(value = "/jobs", consumes = "application/json", produces = MediaType.APPLICATION_JSON_VALUE)
	public String postJobs(@RequestBody Jobs job) {

		jobs.saveJob(job);
		return "ok";
	}
	
	
	
	@ResponseBody
	@GetMapping(value = "/enviroments",  produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Enviroments> getEnviroments() {

		return enviroments.findAllEnviroments();	
	}
	
	@ResponseBody
	@PostMapping(value = "/enviroments", consumes = "application/json", produces = MediaType.APPLICATION_JSON_VALUE)
	public String postEnviroments(@RequestBody Enviroments enviroment) {

		enviroments.saveEnviroments(enviroment);
		return "ok";
	}
	
	
	
	@ResponseBody
	@GetMapping(value = "/status",  produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Status> getStatus() {

		return status.findAllStatus();	
	}
	
	@ResponseBody
	@PostMapping(value = "/status", consumes = "application/json", produces = MediaType.APPLICATION_JSON_VALUE)
	public String postStatus(@RequestBody Status status) {

		this.status.saveStatus(status);
		return "ok";
	}
	
	
	
	@ResponseBody
	@GetMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Users> getUsers() {

		return user.findAllUsers();	
	}
	
	@ResponseBody
	@PostMapping(value = "/users", consumes = "application/json", produces = MediaType.APPLICATION_JSON_VALUE)
	public String postUsers(@RequestBody Users user) {

		this.user.saveUser(user);
		return "ok";
	}
	
}
