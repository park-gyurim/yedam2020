package com.yedam.pgr.interfaces;

import java.util.List;

import com.yedam.pgr.interfaces.model.Employee;
import com.yedam.pgr.interfaces.model.Employees;

public interface Service {

	public void addMember(Employees emp, List<Employees> list);

	public Employees getMember(int memberId, List<Employees> list);

	public List<Employees> getMemberList(List<Employees> list);

	public void updateMember(Employees emp, List<Employees> list);

	public void addEmp(Employee emp, Employee[] employees);

	public void updateDBEmp(Employees emp);

	public Employees getDBEmployee(int no);

	public List<Employees> getDBEmployees();

	public static List<Employees> getEmpList() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
