package com.advancia.stage.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "JOBS")
public class Jobs {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@OneToMany // JOB_HISTORY,EMPLOYEES
	@Column(name = "JOB_ID")
	private Jobs id;

	@Column(name = "JOB_TITLE")
	private String jobt;
	@Column(name = "MIN_SALARY")
	private int min;
	@Column(name = "MAX_SALARY")
	private int max;

	public Jobs getId() {
		return id;
	}

	public void setId(Jobs id) {
		this.id = id;
	}

	public String getJobt() {
		return jobt;
	}

	public void setJobt(String jobt) {
		this.jobt = jobt;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}
}