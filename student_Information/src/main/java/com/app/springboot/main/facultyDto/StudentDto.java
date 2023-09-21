package com.app.springboot.main.facultyDto;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;

import org.hibernate.annotations.Type;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class StudentDto {
	private UUID id;
	
	private String stduent_name;
	
	private String age;
	
	private int registration_no;
	
	private int roll_no;

	private String status;
	
	private String role;

	private String action;
		

}
