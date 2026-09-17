/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
Scanner sc = new Scanner(System.in);


		System.out.println("=================================================");
		System.out.println("            WELCOME RESTAURANT OWNER!            ");
		System.out.println("=================================================");
		System.out.println();
		String questionName = "What is your name?"; 	
		System.out.println(questionName);	
		String replyName = sc.nextLine();
		System.out.println();
		String questionRestaurant = "What is the name of your restaurant?";
		System.out.println(questionRestaurant);
		String replyRestaurant = sc.nextLine();
		System.out.println();
		System.out.println("Great to see you, " + replyName + "! Let's set up a menu for " + replyRestaurant + "!");
		System.out.println("Tonight's menu has room for exactly three iems. Let's go!");
		System.out.println();
		System.out.println("--- Item #1 ---");
		String replyItem1 = sc.nextLine();
		System.out.println("Item name: " + replyItem1);
		

	
	}
}
