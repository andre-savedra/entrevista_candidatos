package com.spring.selecao.populateData;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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

@Component
public class PopulateData {
	
	@Autowired
	EnviromentService enviromentsRep;
	
	@Autowired
	JobsService jobRep;
	
	@Autowired
	StatusService statusRep;
	
	@Autowired
	TasksService tasksRep;
	
	@Autowired
	UsersService userRep;
	
	//@PostConstruct
	public void load() {
		
		
		Jobs job1 = new Jobs();
		job1.setLevel(10);
		job1.setDescription("Analista");
		jobRep.saveJob(job1);
		
		Jobs job2 = new Jobs();
		job2.setLevel(5);
		job2.setDescription("Docente");
		jobRep.saveJob(job2);
		
		Jobs job3 = new Jobs();
		job3.setLevel(20);
		job3.setDescription("Coordenador");
		jobRep.saveJob(job3);
		
				
		Status sts1 = new Status();
		sts1.setDescription("Iniciada");
		statusRep.saveStatus(sts1);
		
		Status sts2 = new Status();
		sts2.setDescription("Em andamento");
		statusRep.saveStatus(sts2);
		
		Status sts3 = new Status();
		sts3.setDescription("Finalizada");
		statusRep.saveStatus(sts3);
		
		
		Enviroments env1 = new Enviroments();
		env1.setName("Laboratório de Informática 1");
		enviromentsRep.saveEnviroments(env1);
		
		Enviroments env2 = new Enviroments();
		env2.setName("Laboratório de Informática 2");
		enviromentsRep.saveEnviroments(env2);
		
		Enviroments env3 = new Enviroments();
		env3.setName("Laboratório de Eletrônica 1");
		enviromentsRep.saveEnviroments(env3);
		
		
		Users user1 = new Users();
		user1.setName("João José");
		user1.setEmail("joao@gmail.com");
		user1.setBirth(LocalDate.of(1993,10,10));
		user1.setJob(job1);
		user1.setId(20255L);
		userRep.saveUser(user1);
		
		Users user2 = new Users();
		user2.setName("Maria Silva");
		user2.setEmail("msilva@gmail.com");
		user2.setBirth(LocalDate.of(2000,11,1));
		user2.setJob(job1);
		user2.setId(151515L);
		userRep.saveUser(user2);
		
		Users user3 = new Users();
		user3.setName("Luís Augusto Mota");
		user3.setEmail("mota@gmail.com");
		user3.setBirth(LocalDate.of(1985,5,9));
		user3.setJob(job3);
		user3.setId(65872L);
		userRep.saveUser(user3);
		
		
		Tasks task1 = new Tasks();
		task1.setName("Cabos de Rede");
		task1.setDescription("Arrumar os cabos de rede com falha de conexão");
		task1.setRequester(user3);
		task1.setStartDate(LocalDate.of(2022,1,1));
		task1.setEndDate(LocalDate.of(2022,4,8));
		task1.setStatus(sts1);
		task1.setEnviroment(env1);
		List<Users> usersTask1 = new ArrayList<>();
		usersTask1.add(user1);
		task1.setUsersTarget(usersTask1);
		tasksRep.saveTask(task1);
		
		
		
		
	}
}
