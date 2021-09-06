package com.technoelevate.employeedetails.DAOjdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.technoelevate.employeedetails.DTO.EmployeeInformation;

@Component
public class EmployeeDatabaseUsingJDBC {
	JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int insertEmployee(EmployeeInformation ei) {
		String query = "insert into employee_details values(?,?,?,?)";
		int s = template.update(query, ei.getEmpid(), ei.getEmpname(), ei.getAddress(), ei.getPassword());
		return s;
	}
	
	public EmployeeInformation authenticateEmployee(int id) {
		RowMapper<EmployeeInformation> row = new RowMappingImplementation();
		String query = "select * from employee_details where employee_id=?";
		EmployeeInformation ei = template.queryForObject(query, row, id);
		return ei;
	}

	public int updateEmployee(EmployeeInformation ei) {
		String query = "update employee_details set address=?, employee_name=?,password=? where employee_id=?";
		int s = template.update(query, ei.getEmpname(), ei.getPassword(), ei.getEmpid());
		return s;
	}

	public int deleteEmployee(EmployeeInformation ei) {
		String query = "delete from employee_details where employee_id=?";
		int s = template.update(query, ei.getEmpid());
		return s;

	}

	public EmployeeInformation getEmp(int id) {
		RowMapper<EmployeeInformation> row = new RowMappingImplementation();
		String query = "Select * from employee_details where employee_id=?";
		EmployeeInformation ei = template.queryForObject(query, row, id);
		return ei;
	}

	public List<EmployeeInformation> getAllEmp() {
		RowMapper<EmployeeInformation> row = new RowMappingImplementation();
		String query = "select * from employee_details";
		List<EmployeeInformation> ei = template.query(query, row);
		return ei;
	}
}
