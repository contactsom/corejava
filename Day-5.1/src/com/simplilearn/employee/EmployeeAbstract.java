package com.simplilearn.employee;

abstract class EmployeeAbstract {

	String empName="ABC";
	String emapDept="Operation";
	int empId=308;
	// CC no
	// CC pin
	// CC ccv
	
	
	
	public EmployeeAbstract() {
		
	}
	
	
	public EmployeeAbstract(String empName, String emapDept, int empId) {
		super();
		this.empName = empName;
		this.emapDept = emapDept;
		this.empId = empId;
	}


	@Override
	public String toString() {
		return "EmployeeAbstract [empName=" + empName + ", emapDept=" + emapDept + ", empId=" + empId + "]";
	}
		
	
}
