package com.ibm.self_hibernate_learn.controller;

import com.ibm.self_hibernate_learn.dao.EmployeeDao;
import com.ibm.self_hibernate_learn.entity.Employee;

public class EmployeeInsertController {
	
	public static void main(String[] args) {
		
		EmployeeDao dao = new EmployeeDao();
		
//		INSERT
//		Employee employee = new Employee(104,"Obito","obito@gmail.com",96325874);
//		dao.saveEmployeeDao(employee);
		
		
		
		
//		DISPLAY
		//how to fetch the data by Id(primary key)
		//IllegalArgumentException if empId is not the primary that we are passing
//		Employee emp = dao.getEmployeeById(102);
//		System.out.println(emp);
		
		
		
//		DELETE
//		boolean b = dao.deleteEmployeeByIdDao(103);
//		if(b) {
//			System.out.println("Data Deleted");
//		}else {
//			System.out.println("something went wrong please check the id....");			
//		}
		
		
		
//		UPDATE
		Employee upd = dao.updateEmployeeById(102, "rin", "rin@gmail.com", 75395146);
		if(upd!=null) {
			System.out.println(upd);
			System.out.println("Data Updated");
		}else {
			System.out.println("Something went wrong , please check the id");
		}
		
		
		
		
	}

}
