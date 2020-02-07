package com.yedam.pgr.interfaces;

import java.util.ArrayList;
import java.util.List;

import com.yedam.pgr.interfaces.impl.EmpDAO;
import com.yedam.pgr.interfaces.model.Employee;
import com.yedam.pgr.interfaces.model.Employees;

public class ServiceImpl implements Service  {

   
   //한건입력
   @Override
   public void addMember(Employees emp, List<Employees> list) {
   
   }
   
//2.전체 조회
   @Override
   public Employees getMember(int memberId, List<Employees> list) {
      return null;
   }

   @Override
   public List<Employees> getMemberList(List<Employees> list) { //list를 루틴 돌며  읽어줌
      List<Employees> destList = new ArrayList<>();
      for(Employees emp : list) {
         destList.add(emp);
      }
      return destList;
   }

   @Override
   public void updateMember(Employees emp, List<Employees> list) {
      
   }

@Override
public void addEmp(Employee emp, Employee[] employees) {
	// TODO Auto-generated method stub
	
}

@Override
public void updateDBEmp(Employees emp) {
	// TODO Auto-generated method stub
	
}

@Override
public Employees getDBEmployee(int no) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<Employees> getDBEmployees() {
	List<Employees> list = Service.getEmpList();
	return list;
}


}
