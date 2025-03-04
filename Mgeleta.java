package com.pojo;

import java.util.*;

public class EmployeeMain {

// CHANGE FOR GITHUB

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<EmployeeInfo> list = new ArrayList<>();

		EmployeeInfo p1 = new EmployeeInfo();

		p1.setEmpId(100);
		p1.setEmpName("Hanif");
		p1.setEmpSalary(30000.987);
		
		list.add(p1);

		EmployeeInfo p2 = new EmployeeInfo();

		p2.setEmpId(200);
		p2.setEmpName("Mohammed Iqbal");
		p2.setEmpSalary(15000.67);
		
		list.add(p2);
		
//		System.out.println(p1.getEmpId()+" "+p1.getEmpName()+ " "+p1.getEmpSalary());
//	    System.out.println(p2.getEmpId()+" "+p2.getEmpName()+ " "+p2.getEmpSalary());
		
		System.out.println("\n Using for each: ");

		for(EmployeeInfo elt: list) {
			System.out.println(elt.getEmpId()+" "+elt.getEmpName()+ " "+elt.getEmpSalary());
		}
		
		
		//iterator
		System.out.println("\n Using Iterator: ");
		
		Iterator itr =list.iterator();
		
		while(itr.hasNext()) {
			EmployeeInfo emp =  (EmployeeInfo)itr.next();
			System.out.println(emp.getEmpId()+" "+emp.getEmpName()+ " "+emp.getEmpSalary());
			
		}
		
	}

}
