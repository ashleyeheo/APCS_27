/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
	
	int answer = (int)(Math.random()*1000+1);
	int guess = 0;
	
	while(answer!=guess) {
		System.out.println("Guess a number 1-1000.");
		guess = sc.nextInt();
		
		if (guess < answer) {
			System.out.println("your guess was too low!");
		}
		else if(guess > answer) {
			System.out.println("your guess was too high!");
		}
		else {
			System.out.println("you got it!");
			System.out.println("the number was " + answer);
			break;
		}
	}



		
	}
}
