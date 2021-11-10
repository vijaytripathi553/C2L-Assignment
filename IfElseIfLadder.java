package com.c2lbiz.practice;

// WAP to display maximum amongest 3 numbers
import java.util.*;

public class IfElseIfLadderExample {

	private static void findMax(int firstNo, int secondNo, int thirdNo) {

		if (firstNo > secondNo && firstNo > thirdNo) {
			System.out.println(firstNo + " " + "is grater");
		} else if (secondNo > firstNo && secondNo > thirdNo) {
			System.out.println(secondNo + " " + "is grater");
		} else {
			System.out.println(thirdNo + " " + "is grater");
		}

	}

	// Main Method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st No:");
		int firstNo = sc.nextInt();

		System.out.println("Enter 2nd No:");
		int secondNo = sc.nextInt();

		System.out.println("Enter 3rd No:");
		int thirdNo = sc.nextInt();

		findMax(firstNo, secondNo, thirdNo);

	}

}
