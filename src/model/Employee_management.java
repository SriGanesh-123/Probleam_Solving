package model;

import java.util.Scanner;

public class Employee_management {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.println("\t\t\t Employee Management");
			System.out.println("\n1. Add Employee");
			System.out.println("2. View All Employee");
		    System.out.println("3. Search Employee");
		    System.out.println("4. Delete Employee");
		   
		    System.out.println("5. Exit");
		    System.out.print("Choice: ");
		    int choice = sc.nextInt();
		    sc.nextLine();
		   // switch(choice)

		    
		    Employee user1=new Employee();
		    user1.setEmpid(12);
		    System.out.println(user1.getEmpid());
		    
		}
	}

}
