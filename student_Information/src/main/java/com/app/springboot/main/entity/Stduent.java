package com.app.springboot.main.entity;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_kiruba_stduent" )
public class Stduent  {
	
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name ="UUID",strategy = "org.hibernate.id.UUIDGenerator")
	@Type(type = "uuid-char")
	@Column(name = 	"id", updatable = false, nullable = false)
	private UUID id;
	
	@Column(name = "stduent_name")
	private String stduent_name;
	
	@Column(name = "date_of_birth")
	private Date date_of_birth;
	
	@Column(name = "age")
	private String age;
	
	@Column(name = "registration_no")
	private int registration_no ;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "roll_no")
	private int roll_no;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "role")
	private String role;
	
	@Column(name = "action")
	private String action;
	
	
	@Type(type = "uuid-char")
	@Column(name = "city_id")
	private UUID city_id;
	
	@Column(name = "start_date")
	private Date start_date;
	
	@Column(name = "end_date")
	private Date end_date;
	
}

