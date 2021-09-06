package com.technoelevate.employeedetails.service;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.technoelevate.employeedetails.DAOjdbc.EmployeeJdbc;
import com.technoelevate.employeedetails.DTO.EmployeeInformation;

@Component
public class EmployeeService {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/technoelevate/employeedetails/DAOjdbc/empconfig.xml");
		EmployeeJdbc dao=(EmployeeJdbc)context.getBean("employeejdbc"); 
	 
		public int insertEmp(EmployeeInformation emp) {
			return dao.insertEmployee(emp);
			
		}
		public boolean authenticateEmp(int id,String password) {
			EmployeeInformation e=new EmployeeInformation();
			dao.authenticateEmployee(id);
			if(password==e.getPassword()) {
				return true;
			}else {
				return false;
			}
		}
		public int updateStd(EmployeeInformation ei) {
			return dao.updateEmployee(ei);
		}
		
		public int deleteStd(EmployeeInformation ei) {
			return dao.deleteEmployee(ei);
		}
		
		public EmployeeInformation getEmp(int id) {
			return dao.getEmp(id);
		}
		
		public List<EmployeeInformation> getAllEmp(){
		   return	dao.getAllEmp();
		}
		public boolean insertEmployee(int id, String password) {
			return false;
		}
		public EmployeeInformation validateInsert(EmployeeInformation ei) {
			return dao.authenticateEmployee(0);
		}
		
		
		
		
		

	}
