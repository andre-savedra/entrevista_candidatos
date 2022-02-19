package com.spring.selecao.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;

@Entity
@Table(name="TB_USERS")
public class Users {
	
	@Id
	@NotNull
	private Long id;	
	
	@NotBlank
	private String name;
			
	@NotBlank
	private String email;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate birth;
	
	@NotNull	
	@ManyToOne
	private Jobs job;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getBirth() {
		return birth;
	}

	public void setBirth(LocalDate birth) {
		this.birth = birth;
	}

	public Jobs getJob() {
		return job;
	}

	public void setJob(Jobs job) {
		this.job = job;
	}
	
	
	

}
