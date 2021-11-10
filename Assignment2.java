MoBike.java
................................................................................................................................................................................
package com.c2lbiz.practice;
import java.util.*;
public class MoBike {
	public int bno;
	int phno;
	String name;
	int days;
	int charge;
	
	
	
	// Input and store the details Of User
	
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Bike No:");
		bno=sc.nextInt();
		
		System.out.println("Enter Phone No:");
		phno=sc.nextInt();
		
		System.out.println("Enter no of days you want bike for rent:");
		days=sc.nextInt();
		
		/*
		 * System.out.println("Enter Bike charges:"); charge=sc.nextInt();
		 */
		
	}	
	
	// to compute the rental charge
	public void compute()
	{
		if(days==1 || days<=5)
		{
			charge=days*500;
			
			
		}
		else if(days>5 || days<=10)
		{
			charge=days*400;
		}
		else
		{
			charge=days*200;
		}
		
	}	
	// To display the details in the following format
	
	public void display()
	{
		System.out.println("Bike No:"+bno);
		System.out.println("Phone No:"+phno);
		System.out.println("No of Days:"+days);
		System.out.println("Charge:"+charge);
		
	}	
}
...............................................................................................................................................................................
  MoBikeMain.java
  ................................................................................................................................................................................
  package com.c2lbiz.practice;
public class MoBikeMain {
	public static void main(String[] args) 
	{
		MoBike mb=new MoBike();
		
		mb.input();
		mb.compute();
		mb.display();
				
		
	}

}


.............
  OUTPUT
 ............
  Enter Bike No:
1
Enter Phone No:
75170
Enter no of days you want bike for rent:
10
Bike No:1
Phone No:75170
No of Days:10
Charge:4000
