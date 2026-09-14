/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner (System.in);
	System.out.println("What is your name?");
	String text = sc.nextLine();
	System.out.println("How old are you?");
	int age = sc.nextInt();
	System.out.println("If you had a dollar and two quarters, how much money would you have?");
	double money = sc.nextDouble();
	System.out.println("Your name is " + text + ".");
	System.out.println("You are " + age + ".");
	System.out.print("You have " + money + ".");



	}
}
