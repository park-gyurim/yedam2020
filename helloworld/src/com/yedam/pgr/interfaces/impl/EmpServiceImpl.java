package com.yedam.pgr.interfaces.impl;

import com.yedam.pgr.interfaces.model.EmpService;
import com.yedam.pgr.interfaces.model.Employee;
import com.yedam.pgr.interfaces.model.Employees;


public class EmpServiceImpl implements EmpService {

   @Override
   public void addEmp(Employee emp, Employee[] emps) {
//      System.out.println("추가기능");
      for (int i = 0; i < emps.length; i++) {
         if (emps[i] == null) {
            emps[i] = emp;
            break;
         }
      }
      System.out.println("입력완료");
   }

   @Override
   public void searchEmp(int empNo, Employee[] emps) {
      System.out.println("조회기능");
   }

   @Override
   public void empList(Employee[] emps) {
//      System.out.println("리스트기능");
      for (Employee emp : emps) {
         if (emp != null) {
            System.out.println(emp);
         }
      }
   }

   @Override
   public void delEmp(int empNo, Employee[] emps) {
//      System.out.println("삭제기능");
      for (int i = 0; i < emps.length; i++) {
         if (emps[i] != null && emps[i].getEmpNO() == empNo) {
            emps[i] = null;
         }
      }
   }

   @Override
   public void searchEmployees() {
      System.out.println("디비조회");
      EmpDAO dao = new EmpDAO();
      Employees[] empArray = dao.getEmployees();
      for (Employees emp : empArray) {
         if (emp != null) {
            System.out.println(emp);
         }
      }
   } // end of searchEmployees

   @Override
   public void insertEmployees(Employees emp) {
      System.out.println("디비 입력 기능");
      EmpDAO dao = new EmpDAO();
      dao.insertEmployees(emp);
   } // end of insertEmployees


	
}

