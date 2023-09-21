package com.app.springboot.main.controller;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.springboot.main.entity.Department;
import com.app.springboot.main.entity.Stduent;
import com.app.springboot.main.facultyDto.StudentDto;
import com.app.springboot.main.repository.StduentRepository;
import com.app.springboot.main.service.StduentService;



@RestController
@RequestMapping("/appointment")
public class StduentController {

	@Autowired
	public StduentService stduentservice;


	@PostMapping(value="/create")
	public Stduent createFaculty (@RequestBody Stduent stduent) {
		stduentservice.savestduent(stduent);
		return stduent;
	}
	@GetMapping(value="/getDto/{id}")
	public StudentDto getStduedentById(@PathVariable UUID id) {
		Stduent stduent = stduentservice.getStduedentById(id );
		
		StudentDto stduentdto =new StudentDto();
		
		stduentdto.setId(stduent.getId());
		stduentdto.setStduent_name(stduent.getStduent_name());
		stduentdto.setAge(stduent.getAge());
		stduentdto.setRegistration_no(stduent.getRegistration_no());
		stduentdto.setRoll_no(stduent.getRoll_no());
		stduentdto.setStatus(stduent.getStatus());
		stduentdto.setRole(stduent.getRole());
		stduentdto.setAction(stduent.getAction());
		return stduentdto;
		
	}
	 @Autowired
	    private StduentRepository studentRepository;

	    @GetMapping("/search")
	    public ResponseEntity<List<Stduent>> searchByDateRange(@RequestParam("start_date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date start_date,
	                                                           @RequestParam("end_date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date end_date) {
	        List<Stduent> students = studentRepository.findByStartDateBetween(start_date, end_date);
	        return ResponseEntity.ok(students);
	    }
	
	
}

