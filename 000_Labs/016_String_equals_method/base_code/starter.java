/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	
Scanner sc = new Scanner(System.in);
		
		System.out.println("would you like to be a rogue, wizard, or warrior?");
		String questionrww = sc.nextLine();
		
		if ((questionrww.equalsIgnoreCase("rogue"))) {
			System.out.println("you have chosen to be a rogue! stealthy!");
		}
		else if ((questionrww.equalsIgnoreCase("warrior"))) {
			System.out.println("you have chosen to be a warrior! charge!");
		}
		else if ((questionrww.equalsIgnoreCase("wizard"))) {
			System.out.print("you have chosen to be a wizard! exquisite!");
		}
		else {
			System.out.println("you have not chosen a role. rerun program.");
		}


	}
}
