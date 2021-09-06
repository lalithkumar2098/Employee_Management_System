package com.technoelevate.employeedetails.DAOjdbc;

import java.util.List;

import com.technoelevate.employeedetails.DTO.EmployeeInformation;

public  interface EmployeeJdbc {

	public int insertEmployee(EmployeeInformation ei);
	public EmployeeInformation authenticateEmployee(int id);
	public int updateEmployee(EmployeeInformation ei);
	public int deleteEmployee(EmployeeInformation ei);
	public EmployeeInformation getEmp(int id);
	public List<EmployeeInformation> getAllEmp();

	
	
}
