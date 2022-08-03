package com.advancia.stage.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.advancia.stage.model.Employee;

public class Dao {

	private static final Map<String, Employee> empMap = new HashMap<String, Employee>();

	public Dao() {
		super();
	}

	private EntityManager init() {
		EntityManager entityManager = DaoUtil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
		return entityManager;
	}

	public static List<Employee> getAllEmployees() {
		EntityManager entityManager = (EntityManager) Dao.getAllEmployees();
		TypedQuery<Employee> query = entityManager.createQuery("SELECT i FROM EMPLOYEES i", Employee.class);
		List<Employee> employees = query.getResultList();
		entityManager.getTransaction().commit();
		entityManager.close();
		return employees;
	}

	public Employee getEmployee(int EMPLOYEE_ID) {

		EntityManager entityManager = this.init();
		Employee employee = (Employee) entityManager.find(Employee.class, Integer.valueOf(EMPLOYEE_ID));

		entityManager.getTransaction().commit();
		entityManager.close();
		return employee;
	}

	public Employee updateEmployee(Employee emp, int EMPLOYEE_ID) {

		EntityManager entityManager = this.init();

		Employee employee = (Employee) entityManager.find(Employee.class, EMPLOYEE_ID);
		employee.setFirsn(emp.getFirsn());
		employee.setLastn(emp.getLastn());
		employee.setEmail(emp.getEmail());
		employee.setPhone(emp.getPhone());
		employee.setJob(emp.getJob());
		employee.setHiredate(emp.getHiredate());
		employee.setDepartment(emp.getDepartment());
		employee.setManager(emp.getManager());
		employee.setSalary(emp.getSalary());

		entityManager.persist(employee);
		entityManager.getTransaction().commit();
		entityManager.close();

		return employee;
	}

	public void deleteEmployee(int EMPLOYEE_ID) {

		EntityManager entityManager = this.init();

		Employee employee = (Employee) entityManager.find(Employee.class, Integer.valueOf(EMPLOYEE_ID));
		entityManager.remove(employee);

		entityManager.getTransaction().commit();
		entityManager.close();
	}

	public static Employee addEmployee(Employee emp) {
		empMap.put(emp.getFirsn(), emp);
		return emp;
	}

}