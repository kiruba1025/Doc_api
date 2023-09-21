package com.app.springboot.main.entity;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
//@JsonIgnoreProperties(value = {modified_on,deleted_by,deleted_on})
public class RecordModifier {
	
	@Enumerated(EnumType.STRING)
	@Column(name = "status",nullable = false,updatable = false )
	private  Status status;
	
	@Column(name = "created_by")
	private String created_by;
	
	@Column(name = "created_on")
	private LocalDateTime created_on;
	
	@Column(name = "modified_by")
	private String modified_by;
	
	@Column(name = "modified_on")
	private LocalDateTime modified_on;
	
	@Column(name = "deleted_by")
	private String deleted_by;
	
	@Column(name = "deleted_on")
	private LocalDateTime deleted_on;
	
}
