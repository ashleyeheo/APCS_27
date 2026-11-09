/*
 *	Author:
 *  Date:
 * 	Collaborator:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int question = (int)(Math.random()*3);
		
		if(question == 0) {
			System.out.println("the goal of the game is to guess the correct word.\nyou get two hints");
			System.out.println(" ");
			System.out.println("it'a fruit");
			System.out.println("input your first guess");
			String fruit = sc.nextLine();
			if (fruit.equals("Pineapple") || fruit.equals("pineapple")) {
				System.out.println("you got it first try! nice!");
			}
			else {
				System.out.println("second hint: it is spiky.");
				fruit = sc.nextLine();
				
				if (fruit.equals("Pineapple") || fruit.equals("pineapple")) {
					System.out.println("you got it! nice!");
				}
				else {
					System.out.println("the word was pineapple. better luck next time!");
				}
			}
		}
		if(question == 1) {
			System.out.println("the goal of the game is to guess the correct word.\nyou get two hints");
			System.out.println(" ");
			System.out.println("it's an animal");
			System.out.println("input your first guess");
			String fruit = sc.nextLine();
			if (fruit.equals("Dog") || fruit.equals("dog")) {
				System.out.println("you got it first try! nice!");
			}
			else {
				System.out.println("second hint: it's a man's best friend!");
				fruit = sc.nextLine();
				
				if (fruit.equals("Dog") || fruit.equals("dog")) {
					System.out.println("you got it! nice!");
				}
				else {
					System.out.println("the word was dog. better luck next time!");
				}
			}
		}
		if(question == 2) {
			System.out.println("the goal of the game is to guess the correct word.\nYou get two hints");
			System.out.println(" ");
			System.out.println("it's a video game");
			System.out.println("input your first guess");
			String fruit = sc.nextLine();
			if (fruit.equals("Minecraft") || fruit.equals("minecraft")) {
				System.out.println("you got it first try! nice!");
			}
			else {
				System.out.println("second hint: it involves blocks and sometimes is multiplayer!");
				fruit = sc.nextLine();
				
				if (fruit.equals("Minecraft") || fruit.equals("minecraft")) {
					System.out.println("you got it! nice!");
				}
				else {
					System.out.println("the word was minecraft. better luck next time!");
				}
			}
		}
	}
}