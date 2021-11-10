EmpAddress.java
....................................................................................................................................................................................
  package com.c2lbiz.practice;
/*
 * FUNCTIONALITY AND TASK 
 * 
 * ✔ Define a class EmpAddress
 * 🔴 Instance Variables / data members
 * 
 * Private String empName;
 * Private String empNo;
 * Private String street;
 * Private String city;
 * Private Sting state;
 * Private String code;
 * 
 * ✔ Define a class Mailing List
 * 🔴 Use LinkedList to store the address of Employee
 * 🔴 Function to allow searching of a particular Employee  details using Binary Search
 * 🔴 Display all employee details using iterator
 * 
 * 
 * 
 * 
 * 
 */

import java.util.*;
public class EmpAddress {
	// Private data members
	private static String empName;
	private String empNo;
	private String street;
	private String city;
	private String state;
	private String code;
	
	
	
	// Method to display Employee record
	public static void display(LinkedList<String> list)
	{
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next()); 
		}
	}
	
	// Method to Search Employee
	
	public static void searchEmployee(LinkedList<String> list, String searchName)
	{
		
		if(list.contains(searchName))
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not Found");
			
		}
	}
		
		
	}


...............................................................................................................................................................................
  MailingList.java
  
  package com.c2lbiz.practice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/*
 * FUNCTIONALITY AND TASK 
 * 
 * ✔ Define a class EmpAddress
 * 🔴 Instance Variables / data members
 * 
 * Private String empName;
 * Private String empNo;
 * Private String street;
 * Private String city;
 * Private Sting state;
 * Private String code;
 * 
 * ✔ Define a class Mailing List
 * 🔴 Use LinkedList to store the address of Employee
 * 🔴 Function to allow searching of a particular Employee  details using Binary Search
 * 🔴 Display all employee details using iterator
 * 
 * 
 * 
 * 
 * 
 */


public class MailingList {
	// Main Method
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String empName="",empNo="",street="",city="",state="", code="";
			LinkedList<String> list=new LinkedList<>();
			
			System.out.println("How many employee objects you want to add into list");
			int noOfRecords=sc.nextInt();
			
			for (int i = 0; i < noOfRecords; i++) 
			{

				System.out.println("Enter Employee Name");
				 empName=sc.next();
				
				System.out.println("Enter Employee No");
				 empNo=sc.next();
				
				System.out.println("Enter Employee  Street");
				 street=sc.next();
				
				System.out.println("Enter Employee City");
				 city=sc.next();
				
				System.out.println("Enter Employee State");
				 state=sc.next();
				
				System.out.println("Enter Employee Code");
				 code=sc.next();
				 System.out.println("--------------------------------------------");
				 
				 
				// Adding EmployeeAddress object into list
			    	list.add(empName);
					list.add(empNo);
					list.add(street);
					list.add(city);
					list.add(state);
					list.add(code);
				
				
			}
			// Method call
			EmpAddress ea=new EmpAddress();
			ea.display(list);
			
			// Search Employee
			System.out.println("Enter Employee name which you want to search in the list:");
			String searchName=sc.next();
			
			ea.searchEmployee(list,searchName);
		}
			

}

	



OUTPUT

........................................................
  How many employee objects you want to add into list
2
Enter Employee Name
Vijay
Enter Employee No
101
Enter Employee  Street
Narhe
Enter Employee City
Pune
Enter Employee State
MH
Enter Employee Code
12312
--------------------------------------------
Enter Employee Name
Shiv
Enter Employee No
102
Enter Employee  Street
Banglore
Enter Employee City
Banglore
Enter Employee State
KK
Enter Employee Code
02
--------------------------------------------
Vijay
101
Narhe
Pune
MH
411041
Shiv
102
Banglore
Banglore
KK
02
Enter Employee name which you want to search in the list:
Vijay
Found
