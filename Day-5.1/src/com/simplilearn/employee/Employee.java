package com.simplilearn.employee;

public class Employee {

	String empName="ABC";
	String emapDept="Operation";
	int empId=308;
	
	
	public Employee() {
		
	}
	
	
	public Employee(String empName, String emapDept, int empId) {
		super();
		this.empName = empName;
		this.emapDept = emapDept;
		this.empId = empId;
	}


	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", emapDept=" + emapDept + ", empId=" + empId + "]";
	}
		
	
}
