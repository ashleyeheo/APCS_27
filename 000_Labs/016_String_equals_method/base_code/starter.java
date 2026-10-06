/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
		System.out.println("would you like to be a wizard, warrior, or rogue?");
String questionwwr = sc.nextLine();

		if(questionwwr.equalsIgnoreCase("wizard"))
		{
			System.out.print("you've chosen the wizard! excelsior!");
			System.out.println();
		}
		else if(questionwwr.equalsIgnoreCase("warrior")){
			System.out.print("you've chosen the warrior! for honor!");
			System.out.println();
		}
		else if(questionwwr.equalsIgnoreCase("rogue")){
			System.out.print("you've chosen the rogue! how cunning!");
			System.out.println();
		}
	else{
		System.out.print("you've decided not to choose a role. rerun program.");
		System.out.println();
	};

	}
}
