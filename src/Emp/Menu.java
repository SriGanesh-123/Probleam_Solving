package Emp;

import java.util.Scanner;

public class Menu {
	//static List<Employee> mylist = new ArrayList<Employee>();
	static Object[] employeeData = new Object[5];
	static int empcount=0;

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);
			while (true) {
				System.out.println("\t\t\t Employee Management");
				System.out.println("\n1. Add Employee");
				System.out.println("2. View All Employee");
				System.out.println("3. Display Name   ");
				System.out.println("4. Display Age  ");
				System.out.println("5. Display Salary ");
				System.out.println("6. Display Role ");
				System.out.println("7. Delete Employee");
				System.out.println("8. Exit");
				System.out.print("Choice: ");
				int choice = sc.nextInt();

				switch (choice) {
				case 1: {
					if(empcount<employeeData.length) {
					
				
					
					System.out.print("Employee ID: ");
					int id = sc.nextInt();
					sc.nextLine();
					System.out.print("Employee Name: ");
					String name = sc.nextLine();
					System.out.print("Employee Role : ");
					String role = sc.nextLine();
					System.out.print("Employee Age: ");
					int age = sc.nextInt();
					sc.nextLine();
					System.out.print("Employee Salary: ");
					float salary = sc.nextFloat();
					System.out.print("Company  Name: ");
					String companyname = sc.nextLine();
					System.out.print("Company Location : ");
					String companylocation = sc.nextLine();
					
					System.out.print("Street Name: ");
					String streetname = sc.nextLine();
					System.out.print("City Name: ");
					String cityname = sc.nextLine();
					System.out.print("State  Name: ");
					String statename = sc.nextLine();
					System.out.print("Enter Pincode: ");
					long pincode = sc.nextLong();
					
					
					
					
					
//		            ArrayList<String> empoyeeList = new ArrayList<>();

					Employee user1 = new Employee();
					user1.setEmpid(id);
					user1.setEmployeeName(name);
					user1.setRole(role);
					user1.setAge(age);
					user1.setSalary(salary);
					
					//company 
					Company cmp1=new Company();
					cmp1.setName(companyname);
					cmp1.setLocation(companylocation);
					
					//address
					Address add1=new Address();
					add1.setCity(cityname);
					add1.setState(statename);
					add1.setStreetName(streetname);
					add1.setPincode(pincode);
					
					employeeData[empcount]=user1;
				}else
				{
					System.out.println("Can't Add Employee Details List Full...!");
				}
					//employeeData.add(user1);
					break;
				}
				case 2: {
					if(empcount ==0 ) {
						System.out.println("No Employee Data ");
					}else
					{
					for (Object  emp : employeeData) {
						System.out.println(emp);
					}
					}
					break;

				}
				case 3: {
					for (Object emp : employeeData) {
		//				System.out.println(emp.getClass()+ " " + emp.getEmployeeName());

					}
					break;
				}
				case 4: {
					for (Object emp : employeeData) {
		//				System.out.println(emp.getEmployeeName() + " " + emp.getAge());

					}
					break;
				}
				case 5: {
					for (Object emp : employeeData) {
		//				System.out.println(emp.getEmployeeName() + " " + emp.getSalary());

					}
					break;
				}
				case 6: {
					for (Object emp : employeeData) {
		//				System.out.println(emp.getEmployeeName() + " " + emp.getRole());

					}
					break;
				}
				case 7: {
					System.out.println("Enter the Id to Delete : ");
					int delid = sc.nextInt();
		//			employeeData.removeIf(s -> s.getEmpid() == delid);
					System.out.println("Deleted Succesfully...!");
					break;

				}

				case 8: {
					System.out.println("Good Bye ...!");
					System.exit(0);
					break;
				}

//			    Employee user1=new Employee();
//			    user1.setEmpid(12);
//			    System.out.println(user1.getEmpid());
//			    
				}
				sc.close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
