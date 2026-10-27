/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	
Scanner sc = new Scanner(System.in);
		int random;
		random = (int)(Math.random()*1000 + 1);
		
		System.out.println("Pick a number 1-1000:");
		int numberone = sc.nextInt();
		
		boolean booOne;
		booOne = (num == random);
		if (booOne) {
			System.out.println("you got it correct");
		}
		else if (numberone < random) {
			System.out.println("your number was smaller than the number");
			System.out.println("the number was " + random);
		}
		else if (numberone > random) {
			System.out.println("your number was bigger than the number");
			System.out.println("the number was " + random)
		}



	}
}
