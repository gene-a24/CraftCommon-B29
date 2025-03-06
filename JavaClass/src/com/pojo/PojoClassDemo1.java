package com.pojo;

public class PojoClassDemo1 {
		
		public int empId;
		public String empNmae;
		public double empSalary;
		private Object empName;
		
		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId)  {
			this.empId = empId;
		}
		public String getEmpName()  {
			return getEmpName();
		}
		public String getEmpName1()  {
			return (String) empName;
		}
		public void setEmpNmae(String empName)  {
				this.empNmae = empName;
		}		
		public double getEmpSalary()  {
		    return empSalary;
		}
	  public void setEmpSalary(double empSalary)  {
				this.empSalary = empSalary;
		
		
		
	}

}
