package com.ibm.self_hibernate_learn.dao;

import com.ibm.self_hibernate_learn.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class EmployeeDao {
	
//	NOTE: persistence exception if the 'hibernate' name is not matching to the persistence.xml file
//	EntityManagerFactory : It is a factory to create entity manager instances.
//	The EntityManager is the primary interface used to interact with the persistence context
//	createEntityManagerFactory method creates an instance of EntityManagerFactory.  It takes a single argument, which is the name of the persistence unit defined in the persistence.xml configuration file.
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate");
	
	EntityManager em = emf.createEntityManager();
	
	EntityTransaction et = em.getTransaction();
	
	
	
//	Insert Method
	public Employee saveEmployeeDao(Employee employee) {
		et.begin();
		em.persist(employee);  // to insert data
		et.commit();
		
		return employee;
	}
	
	
//	Display Method
	public Employee getEmployeeById(int empId) {
		
		Employee employee = em.find(Employee.class, empId);
		return employee;
		
	}
	
//	Delete Method
	public boolean deleteEmployeeByIdDao(int empId) {
		Employee emp = getEmployeeById(empId);
		
		
	}
	
	

}
