package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "TEST")
public class UserDTO {
	
	@Id
	@GeneratedValue(generator = "ncsPk")
	@GenericGenerator(name = "ncsPK", strategy = "native")
	@Column(name = "ID", unique = true, nullable = false)
	private Long id;
	
	
	@Column(name = "NAME")
	private Long name;
	
	
	@Column(name = "Salary")
	private double salary;
	

}
