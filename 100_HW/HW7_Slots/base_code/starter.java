/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("welcome to pico slots!");
		System.out.println("do you want advice");
		System.out.println("y for yes, n for no");
			String answerone = sc.nextLine();
	if(answerone.equalsIgnoreCase("y")){
		System.out.print("go big or go home");
		System.out.println();
	}	
	else if(answerone.equalsIgnoreCase("n")){
		System.out.print("ok");
		System.out.println();
	}
	else{
		System.out.print("proceed to slots");
		System.out.println();	
		}

		System.out.println("pico slot rules:");
		System.out.println("1. each player starts with one hundred dollars");
		System.out.println("2. input a wager less than your total amount of money");
		System.out.println("3. the pico slot will roll three numbers from 1 to 10");
		System.out.println("	a. if two numbers match, you double your money");
		System.out.println("	b. if three numbers match, you triple your money");
		System.out.println("c. if none match, you lose your money");
		System.out.println();
		System.out.println("----------------------------------------------------");
		System.out.println();
		System.out.print("would you like to play pico slots? (Yes/yes/Y/y) : ");
			String answertwo = sc.nextLine();
		System.out.println();
		System.out.print("you have $100. how much would you like to wager");
			String answerthree = sc.nextLine();
		System.out.println();
		System.out.println("great! let's play!");
		System.out.println("your rolls are: ");
		System.out.println("-------------------------");
		System.out.print("");


		

		
	}
}
