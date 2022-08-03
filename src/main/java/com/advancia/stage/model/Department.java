package com.advancia.stage.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DEPARTMENTS")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@ManyToOne // JOB_HISTORY, EMPLOYEES
	@Column(name = "DEPARTMENT_ID")
	private Department id;
	@Column(name = "DEPARTMENT_NAME")
	private String dname;

	@OneToOne // EMPLOYEES
	@Column(name = "MANAGER_ID")
	private int manager;

	@OneToOne // LOCATIONS
	@Column(name = "LOCATION_ID")
	private Locations location;

	public Department getId() {
		return id;
	}

	public void setId(Department id) {
		this.id = id;
	}

	public String getStart() {
		return dname;
	}

	public void setStart(String dname) {
		this.dname = dname;
	}

	public int getEnd() {
		return manager;
	}

	public void setEnd(int manager) {
		this.manager = manager;
	}

	public Locations getJob() {
		return location;
	}

	public void setJob(Locations job) {
		this.location = job;
	}


	}
