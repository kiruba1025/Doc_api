package com.app.springboot.main.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.springboot.main.entity.Department;
import com.app.springboot.main.entity.Stduent;
import com.app.springboot.main.repository.StduentRepository;


@Service
public class StduentService {

	@Autowired
	public StduentRepository stduentrepository;



	public void savestduent(Stduent stduent) {

		stduentrepository.save(stduent);
	}



	public Stduent getStduedentById(UUID id) {
		
		return stduentrepository.findAllById(id);
	}

	}

	