package com.rdtech.in.Model;

public class EmployeeBean {

	int EmployeeId ;
	String EmployeeName;
	int EmployeeAge;
	
	public EmployeeBean()
	{
		
	}
	
	public EmployeeBean(int employeeId, String employeeName, int employeeAge) {
		super();
		EmployeeId = employeeId;
		EmployeeName = employeeName;
		EmployeeAge = employeeAge;
	}
	
	public int getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public int getEmployeeAge() {
		return EmployeeAge;
	}
	public void setEmployeeAge(int employeeAge) {
		EmployeeAge = employeeAge;
	}
	
}
