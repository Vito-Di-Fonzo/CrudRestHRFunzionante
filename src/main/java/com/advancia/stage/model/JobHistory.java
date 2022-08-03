package com.advancia.stage.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "JOB_HISTORY")
public class JobHistory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@OneToOne
	@Column(name = "EMPLOYEE_ID")
	private int id;

	@Column(name = "START_DATE")
	private Date start;
	@Column(name = "END_DATE")
	private Date end;

	@OneToOne
	@Column(name = "JOB_ID")
	private JobHistory job;

	@OneToOne
	@Column(name = "DEPARTMENT_ID")
	private int department;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public JobHistory getJob() {
		return job;
	}

	public void setJob(JobHistory job) {
		this.job = job;
	}

	public int getDepartment() {
		return department;
	}

	public void setDepartment(int department) {
		this.department = department;
	}

}