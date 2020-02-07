package com.yedam.pgr.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.yedam.pgr.interfaces.model.Employee;
import com.yedam.pgr.interfaces.model.Employees;

public class ServiceProc {
	Employee[] employees = new Employee[10];

	List<Employees> list = new ArrayList<>();
	Service service = new ServiceImpl();
	Scanner scn = new Scanner(System.in);

	private int memberId;

	public void execute() {
		int memberId = 0;

		
		while (true) {
			System.out.println("========================================");
			System.out.println("1.한 건 입력|2.전체조회|3.한 건 조회|4.수정|5.종료");
			System.out.println("========================================");
			System.out.print("선택> ");
			int menu = scn.nextInt();
			
			
			if (menu == 1) {
				System.out.println("이름:");
				String name = scn.nextLine();scn.nextLine();
				System.out.println("사원번호:");
				int empNo = scn.nextInt(); scn.nextLine();
				System.out.println("급여:");
				int salary = scn.nextInt();scn.nextLine();
				Employee emp = new Employee(name, empNo, salary);
				service.addEmp(emp, employees);

				
			} else if (menu == 2) {
				System.out.println("사원번호 입력:");
				int no = scn.nextInt();
//				service.searchEmp(no, employees);
				Employees emp = service.getDBEmployee(no);
				System.out.println(emp);
			} else if (menu == 3) {
				System.out.print("조회 사원번호 입력.");
				List<Employees> list = service.getDBEmployees();
				for (Employees emp : list) {
					System.out.println(emp);
				}
				
			} else if (menu == 4) {
				System.out.print("조회 사원번호 입력.");
				int empId = scn.nextInt();
				System.out.print("급여 인상분 입력.");
				int sal = scn.nextInt();scn.nextLine();
				System.out.print("변경할 이메일 입력.");
				String email = scn.nextLine();

				Employees emp = new Employees();
				emp.setSalary(sal);
				emp.setEmail(email);
				emp.setEmployeeId(empId);
				
				service.updateDBEmp(emp);
			} else if (menu == 5) {
				break;
			}
		}

	}
}
