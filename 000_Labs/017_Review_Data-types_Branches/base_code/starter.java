/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) { 

	Scanner sc = new Scanner(System.in);
		
		
		System.out.println("what is your name?");
		String name = sc.nextLine();
		System.out.println("what is your title? (ex: slayer of dragons)");
		String title = sc.nextLine();
		
		System.out.println("would you like to be a rogue, wizard, or warrior?");
		String questionrww = sc.nextLine();
		
		if ((questionrww.equalsIgnoreCase("rogue"))) {
			System.out.println("you have chosen to be a rogue! stealthy!");
		}
		else if ((questionrww.equalsIgnoreCase("warrior"))) {
			System.out.println("you have chosen to be a warrior! charge!");
		}
		else if ((questionrww.equalsIgnoreCase("wizard"))) {
			System.out.println("you have chosen to be a wizard! exquisite!");
		}
		else {
			System.out.println("you have not chosen a role. rerun program.");
		}
		
		System.out.println("you have 20 skill points to spend in the following: strength, dexterity, intelligence, and charisma. spend them wisely.");
		
		System.out.println("choose your strength level (1-10)");
		int questionstrength = sc.nextInt();
		while (questionstrength > 10) {
			System.out.println("you must put a number 1-10");
			questionstrength = sc.nextInt();
		}
		
		
		System.out.println("you have " + (20-questionstrength) + " points left to spend");
		System.out.println("choose your dexterity level (1-10)");
		int questiondexterity = sc.nextInt();
		while (questiondexterity > 10) {
			System.out.println("You must put a number 1-10");
			questiondexterity = sc.nextInt();
		}
		
		System.out.println("you have " + (20-questionstrength-questiondexterity) + " points left to spend");
		System.out.println("choose your intelligence level (1-10)");
		int questionintelligence = sc.nextInt();
		while (questionintelligence > 10) {
			System.out.println("You must put a number 1-10");
			questionintelligence = sc.nextInt();
		}
		while ((questionintelligence+questionstrength+questiondexterity)>20) {
			System.out.println("your points spent is over 20, please input a smaller number");
			questionintelligence = sc.nextInt();
		}
		
		System.out.println("you have " + (20-questionstrength-questionintelligence-questiondexterity) + " points left to spend");
		System.out.println("choose your charisma level (1-10)");
		int questionrizz = sc.nextInt();
		while (questionrizz > 10) {
			System.out.println("You must put a number 1-10");
			questionrizz = sc.nextInt();
		}
		while ((intelligence+strength+dexterity+questionrizz)>20) {
			System.out.println("your points spent is over 20, please input a smaller number");
			questionrizz = sc.nextInt();
		}
		
		System.out.println(" ");
		System.out.println("-----------------------------------------------------------");
		System.out.println(" ");
		System.out.println("you are " + name + " and are a " + questionrww);
		System.out.println("you are the " + title + " of CVHS");
		System.out.println("you have the following stats:");
		System.out.println("strength: " + questionstrength);
		System.out.println("dexterity: " + questiondexterity);
		System.out.println("intelligence: " + questionintelligence);
		System.out.println("charisma: " + questionrizz);
	





	}
}
