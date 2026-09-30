/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	
Scanner sc = new Scanner(System.in);
	System.out.print("please enter your first number: ");
	int numberone = sc.nextInt();
	System.out.print("please enter your second number: ");
	int numbertwo = sc.nextInt();
	System.out.print("please enter your third number: ");
	int numberthree = sc.nextInt();
	
if((numberone > numbertwo) && (numberone > numberthree))
	{
		System.out.println("your first number is the largest of the three");
		System.out.print("your first number was " + numberone);	
	}
else if((numbertwo > numberone) && (numbertwo > numberthree))
	{
		System.out.println("your second number is the largest of the three");
		System.out.print("your second number was " + numbertwo);
	}
else if((numberthree > numberone) && (numberthree > numbertwo));
	{
		System.out.println("your third number is the largest of the three");
		System.out.print("your third number was " + numberthree);
	}



	}
}
