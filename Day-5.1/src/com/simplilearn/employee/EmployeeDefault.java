package com.simplilearn.employee;

class EmployeeDefault {

	String empName="ABC";
	String emapDept="Operation";
	int empId=308;
	
	public EmployeeDefault() {
		
	}
	
	public EmployeeDefault(String empName, String emapDept, int empId) {
		super();
		this.empName = empName;
		this.emapDept = emapDept;
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "EmployeeDefault [empName=" + empName + ", emapDept=" + emapDept + ", empId=" + empId + "]";
	}
	
	
}
