package com.technoelevate.employeedetails.DAOjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.technoelevate.employeedetails.DTO.EmployeeInformation;

public class RowMappingImplementation implements RowMapper<EmployeeInformation>{

	@Override
	public EmployeeInformation mapRow(ResultSet rs, int rowNum) throws SQLException {
		EmployeeInformation ei=new EmployeeInformation();
		ei.setEmpid(rs.getInt(1));
		ei.setEmpname(rs.getString(2));
		ei.setAddress(rs.getString(3));
		ei.setPassword(rs.getString(4));
		
		return ei;
	}

}
