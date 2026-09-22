/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {

Scanner sc = new Scanner(System.in);
Math.method(); 

System.out.println("Enter two numbers to create a range for your random number");
System.out.println("Please enter an integer: ");
int numberone = sc.nextInt();
System.out.println("Please enter another integer (bigger than the first): ");
int numbertwo = sc.nextInt();
System.out.println();
System.out.println(numberone + " - " + numbertwo);
System.out.println("Here are five numbers generated in that range.");
int numberthree = numbertwo - numberone;
double a = Math.random()*numberthree;
double b = Math.random()*numberthree;
double c = Math.random()*numberthree;
double d = Math.random()*numberthree;
double e = Math.random()*numberthree;
System.out.print(a + b + c + d + e);






	}
}
