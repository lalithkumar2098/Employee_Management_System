package com.technoelevate.employeedetails.DTO;
import java.io.Serializable;
import lombok.*;
@Data
public class EmployeeInformation implements Serializable {
	private int empid;
	private String empname;
	private String address;
	private String password;
	
}
