package com.app.springboot.main.entity;

import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_kiruba_state" )
public class State extends RecordModifier {
	
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name ="UUID",strategy = "org.hibernate.id.UUIDGenerator")
	@Type(type = "uuid-char")
	@Column(name = "id", updatable = false, nullable = false)
	private UUID id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "short_name")
	private String shortName;
	
//	@Type(type = "uuid-char")
//	@Column(name = "country_id")
//	private UUID countryId;
	
	@JsonManagedReference
	@OneToMany( cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	 @JoinColumn(name = "state_id", referencedColumnName = "id", nullable = false)
	private List<City> city;
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "country_id", referencedColumnName = "id", nullable = false)
	private Country country;
	
}
