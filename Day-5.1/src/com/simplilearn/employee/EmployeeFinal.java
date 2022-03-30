package com.simplilearn.employee;

final class EmployeeFinal {

	String empName="ABC";
	String emapDept="Operation";
	int empId=308;
	
	
	public EmployeeFinal() {
		
	}
	
	
	public EmployeeFinal(String empName, String emapDept, int empId) {
		super();
		this.empName = empName;
		this.emapDept = emapDept;
		this.empId = empId;
	}


	@Override
	public String toString() {
		return "EmployeeFinal [empName=" + empName + ", emapDept=" + emapDept + ", empId=" + empId + "]";
	}
		
	
}
