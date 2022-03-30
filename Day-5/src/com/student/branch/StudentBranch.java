package com.student.branch;

public class StudentBranch {

	String branchName="EC";
	int branchCode=101;
	boolean beanchExist=true;
	float topperCGPA=99.8F;
	
	
	
	public StudentBranch() {
		
	}
	
	
	public StudentBranch(String branchName, int branchCode, boolean beanchExist, float topperCGPA) {
		super();
		this.branchName = branchName;
		this.branchCode = branchCode;
		this.beanchExist = beanchExist;
		this.topperCGPA = topperCGPA;
	}
	
	
	@Override
	public String toString() {
		return "StudentBranch [branchName=" + branchName + ", branchCode=" + branchCode + ", beanchExist=" + beanchExist
				+ ", topperCGPA=" + topperCGPA + "]";
	}
	
	
	
	
}
