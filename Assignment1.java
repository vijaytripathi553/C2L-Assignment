package com.c2lbiz.practice;


/* Interview Process for c2lbiz
 *  	5 rounds    out of 100
 *  1stRound --- >50  (If Marks are > 50) 
 * 						Then Eligible for 2ns Round
 * 						Else Not Eligible for 2nd Round
 * 
 * 2ndRound --- >60  (If Marks are > 60) 
 * 						Then Eligible for 3rd Round
 * 						Else Not Eligible for 3rd Round
 * 
 * 3rdRound --- >70  (If Marks are > 70) 
 * 						Then Eligible for 4th Round
 * 						Else Not Eligible for 4th Round
 * 4thRound --- >80  (If Marks are > 80) 
 * 						Then Eligible for 5th Round
 * 						Else Not Eligible for 5th Round
 * 
 * 1stRound --- >90  (If Marks are > 90) 
 * 						Then "Congratulation... You are selected ..!!"
 * 
 * 						Else "Rejected"
 * */
 
import java.util.*;
public class Assignment1 {
	// Main Method
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name=sc.next();
		
		int maxMark=100;
		
			
		// Nested If (If within if)
		System.out.println("Enter the marks of 1st round of interview:");
		int firstRound=sc.nextInt();
		
		if(firstRound>=50 && firstRound<=100)
		{
			System.out.println("You are eleigible for 2nd round");
			System.out.println("Enter the marks of 2nd round:");
			int secondRound=sc.nextInt();
			if(secondRound>=60 && secondRound<=69)
			{
				System.out.println("You are eleigible for 3rd round");
				System.out.println("Enter the marks of 3rd round:");
				int thirdRound=sc.nextInt();
				if(thirdRound>=70 && thirdRound<=79)
				{
					System.out.println("You are eligible for 4th round");
					System.out.println("Enter the marks of 4th round:");
					int fourthRound=sc.nextInt();
					
					if(fourthRound>=80 && fourthRound<=89)
					{
						System.out.println("You are eligible for 5th round");
						System.out.println("Enter the marks of 5th round");
						int fifthRound=sc.nextInt();
						if(fifthRound>=90 && fifthRound<=99)
						{
							System.out.println("Congratulations...");
						}
						else
						{
							System.out.println("Rejected");
						}
					}
					else
					{
						System.out.println("You are not eligible for 5th round");
					}
					
					
				}
				else
				{
					System.out.println("Not eligible for 4th round");
				}
				
			}
			else
			{
				System.out.println("Not eligible for 3rd round");
				
			}
		}
		else
		{
			System.out.println("Not eligible for 2nd round");
			
		}
		
	}

}



.........................................................................................................................................................................
OUTPUT
........................................................................................................................................................................
Enter your name
VT
Enter the marks of 1st round of interview:
55
You are eleigible for 2nd round
Enter the marks of 2nd round:
69
You are eleigible for 3rd round
Enter the marks of 3rd round:
75
You are eligible for 4th round
Enter the marks of 4th round:
81
You are eligible for 5th round
Enter the marks of 5th round
93
Congratulations...
