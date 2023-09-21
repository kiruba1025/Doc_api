package com.app.springboot.main.repository;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.springboot.main.entity.Department;
import com.app.springboot.main.entity.Stduent;

@Repository
public interface StduentRepository extends CrudRepository<Stduent, UUID> {

	public Stduent findAllById(UUID id);
	
	 List<Stduent> findByStartDateBetween(Date start_date, Date endDate);


}
   
