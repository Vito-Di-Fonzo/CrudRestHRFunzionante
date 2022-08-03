package com.advancia.stage.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "employee")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "EMPLOYEES")
public class Employee {
	public Employee() {
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@OneToMany // JOB_HISTORY, MANAGER_ID---->EMPLOYEES
	@Column(name = "EMPLOYEE_ID")

	private int id;
	@Column(name = "FIRST_NAME")
	private String firsn;
	@Column(name = "LAST_NAME")
	private String lastn;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "PHONE_NUMBER")
	private String phone;
	@Column(name = "HIRE_DATE")
	private Date hiredate;
	@Column(name = "JOB_ID")
	private String job;
	@Column(name = "SALARY")
	private int salary;
	@Column(name = "COMMISSION_PCT")
	private int commission;

	@OneToOne // EMPLOYEES
	@Column(name = "MANAGER_ID")
	private int manager;

	@ManyToOne(cascade = CascadeType.ALL) // DEPARTMENT ,
	@Column(name = "DEPARTMENT_ID")
	private Department department;

	public Employee(int id, String firsn, String lastn, String email, String phone, Date hiredate, String job,
			int salary, int commission, int manager, Department department) {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirsn() {
		return firsn;
	}

	public void setFirsn(String firsn) {
		this.firsn = firsn;
	}

	public String getLastn() {
		return lastn;
	}

	public void setLastn(String lastn) {
		this.lastn = lastn;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getCommission() {
		return commission;
	}

	public void setCommission(int commission) {
		this.commission = commission;
	}

	public int getManager() {
		return manager;
	}

	public void setManager(int manager) {
		this.manager = manager;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}
