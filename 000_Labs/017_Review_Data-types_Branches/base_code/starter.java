/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) { 
	Scanner sc = new Scanner(System.in);
		System.out.print("what is your name?");
		System.out.println();
			String answername = sc.nextLine();
		System.out.print("what is your title? ex. slayer of dragons.");
		System.out.println();
			String answertitle = sc.nextLine();	
		System.out.print("would you like to be a wizard, warrior, or rogue?");
			System.out.println();
			String answerrole = sc.nextLine();
		if(answerrole.equalsIgnoreCase("wizard")){
			System.out.print("you've chosen the wizard! excelsior!");
		}
		else if(answerrole.equalsIgnoreCase("warrior")){
			System.out.print("you've chosen the warrior! for honor!");
		}
		else if(answerrole.equalsIgnoreCase("rogue")){
			System.out.print("you've chosen the rogue! how cunning!");
		}
		else{
			System.out.print("you've decided not to choose a role. rerun program.");
		}
		System.out.println();
		System.out.println("you have 20 skill points to spend in the following: strength, dexterity, intelligence, constitution, and charisma. spend them wisely.");
		System.out.println();
		System.out.print("strength (1-10): ");
			int answerstrength = sc.nextInt();
		if(answerstrength > 10){
			System.out.print("please enter a smaller number.");
		}
		else if((answerstrength < 10)&&(answerstrength >= 1)){
				int pointsremaining = 20 - answerstrength;
			System.out.print("you have " + pointsremaining + " left to spend.");
			System.out.println();
		}	
		else{
			System.out.print("not a valid number. rerun program.");
		}
		
		System.out.println();
		System.out.print("dexterity (1-10): ");
			int answerdexterity = sc.nextInt();
			int pointsremainingtwo = pointsremaining - answerdexterity;
		System.out.print("you have " + pointsremainingtwo + " left to spend.");
		System.out.println();
		System.out.print("intelligence (1-10): ");
			int answerintelligence = sc.nextInt();


		








	}
}
