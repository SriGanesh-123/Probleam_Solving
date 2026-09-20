package Emp;

public class Employee {

	private int empid;
	private String employeeName;
	private String Role;
	private int age;
	private float Salary;
	
	public String toString() {
		return getEmployeeName()+" "+getAge()+" "+getEmpid()+" "+getRole()+" "+getSalary();
	}
	
	public int getEmpid() {
		return empid;	
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getSalary() {
		return Salary;
	}
	public void setSalary(float salary) {
		Salary = salary;
	}

}
