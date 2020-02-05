package com.yedam.pgr.interfaces.model;

public interface EmpService {
//저장기능
	public void addEmp(Employee emp, Employee[] emps);
	
	//조회기능
	public void searchEmp(int empNo, Employee[] emps);
	
	//리스트
	public void empList(Employee[] emps);
	//삭제
	public void delEmp(int empNo, Employee[] emps);
	
	//디비 연결 조회 기능
	public void searchEmployees();
	
	//디비 입력 기능
	public void insertEmployees();

	void insertEmployees(Employees emp);
	}

