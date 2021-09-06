package com.technoelevate.employeedetails.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.technoelevate.employeedetails.DTO.EmployeeInformation;
import com.technoelevate.employeedetails.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService serv;
	@GetMapping("/login")
	public String getLogin(ModelMap  map)
	{
		return "login";
	}
	@PostMapping("/getDetails")
	public String getDetails(ModelMap map,EmployeeInformation ei) throws SQLException, ClassNotFoundException {
		if(ei!=null) {
			serv.validateInsert(ei);
			map.addAttribute("addEmp", ei);
			map.addAttribute("msg","Data Successfully Stored");
		}
		else
		{
			map.addAttribute("msg","Data not Stored");
		}
		return "display";
	}
	
	@PostMapping(path="/insert")
	public String getDisplay(ModelMap map,EmployeeInformation ei) throws ClassNotFoundException, SQLException {
		if(ei!=null) {
	    serv.validateInsert(ei);
		map.addAttribute("emp", ei);
		map.addAttribute("msg","successfully added");
		}else {
			map.addAttribute("msg", "not added");
		}
		return "Display";
		
	}
	
	
	@PostMapping(path="/auntheticate")
	public String getAuntheticate(ModelMap map,@RequestParam("id")int id,@RequestParam("password")String password) {
		boolean employee=serv.insertEmployee(id, password);	
		if(employee==true) {

			map.addAttribute("msg","login successfully");
			return "Auntentication";
		}
		return "login";
	
	}
	@PostMapping(path="/update")
	public String getUpdate(ModelMap map,EmployeeInformation ei) {
		if(ei!=null) {
			serv.updateStd(ei);
			map.addAttribute("myStudent", ei);
			map.addAttribute("msg","Successfully updated");
		}
		else {
			map.addAttribute("msg", "not updated");
		}
		return "update";
	}
	
	
	@PostMapping(path="/delete")
	public String getDelete(ModelMap map,EmployeeInformation ei) {
		if(ei!=null) {
			serv.deleteStd(ei);
			map.addAttribute("myStd", ei);
			map.addAttribute("msg","Successfully deleted");
		}
		else {
			map.addAttribute("msg", "not deleted");
		}
		return "delete";
		}
	
	
	
	@PostMapping(path="/getEmployee")
	public String getEmployee(@RequestParam("id")int id,ModelMap map) { 
	EmployeeInformation emp=serv.getEmp(id);
     map.addAttribute("myEmp", emp);
     return "getEmployee";
	}
	
	@PostMapping(path="/getAllEmployee")
   public String getAllEmployee(ModelMap map,EmployeeInformation ei ) {
		List<EmployeeInformation> emp=serv.getAllEmp();
		map.addAttribute("myEmp",emp);
		map.addAttribute("msg","hello Employees");
		return "GetAllEmployes";
	}
}
	