package com.simplilear.hcl.phase3.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name ="user")
@Data
public class UserEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private long id;
	
    @Id
	@Column(name = "user_id",unique=true)
	
	private String userid;
	
	@Column(name = "first_name")
	
	private String firstName;
	
	@Column(name = "last_name")

	private String lastName;
	
	@Column(name = "pwd")
	
	private String pwd;
	
	@Column(name = "email",unique=true)

	private String email;
	
	
	

}

