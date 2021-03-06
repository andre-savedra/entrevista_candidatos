package com.spring.selecao.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="TB_TASKS")
public class Tasks {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@NotBlank
	private String name;
	
	@NotBlank
	private String description;
	
	@OneToOne
	private Users requester;
	
	@OneToMany(fetch = FetchType.EAGER)
	private List<Users> usersTarget = new ArrayList<Users>();
	
	@OneToOne
	private Status status;
	
	@OneToOne
	private Enviroments enviroment;
	
		
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private LocalDate endDate;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private LocalDate startDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Users getRequester() {
		return requester;
	}

	public void setRequester(Users requester) {
		this.requester = requester;
	}

	public List<Users> getUsersTarget() {
		return usersTarget;
	}

	public void setUsersTarget(List<Users> usersTarget) {
		this.usersTarget = usersTarget;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Enviroments getEnviroment() {
		return enviroment;
	}

	public void setEnviroment(Enviroments enviroment) {
		this.enviroment = enviroment;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	
	
	

}
