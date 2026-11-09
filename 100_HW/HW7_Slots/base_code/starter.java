/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("pico slot rules: \n1. each player starts with $100.\n2. input a wager less than your total amount of money.\n3. the slot machine will roll 3 numbers from 1 to 10.\n    a. if two numbers match, you double your money.\n    b. if three numbers match, you triple your money.\n    c. if none match, you lose your money.\n--------------------------------------------------");
		System.out.println("");
		System.out.print("would you like to play pico slots? (Yes/yes/Y/y) : ");
		String player = sc.nextLine();
		int money = 100;
		
		while ((player.equals("Yes")) || (player.equals("yes")) || (player.equals("Y")) || (player.equals("y"))) {
			
			if (money == 0) {
				System.out.println("you lost all your money!");
				break;
			}
			System.out.print("you have " + money + "$, how much would you like to spend? ");
			int wager = sc.nextInt();
			while(wager > money)
				System.out.println("you don't have that much money! \nenter a smaller wager: ");
				wager = sc.nextInt();
			}
			int num1 = (int)(Math.random()*9+1);
			int num2 = (int)(Math.random()*9+1);
			int num3 = (int)(Math.random()*9+1);
			System.out.println("here are the numbers:");
			System.out.println("----------------------------------------------------");
			System.out.println("         " + num1 + " | " + num2 + " | " + num3);
			
			if ((num1 == num2) && (num1 == num3)) {
				System.out.println("you tripled your wager!");
				money = money + (wager * 2);
			}
			else if ((num1 == num2) || (num2 == num3) || (num1 == num3)) {
				System.out.println("you doubled your wager!");
				money = money + wager;
			}
			else {
				System.out.println("you lost your wager!");
				money = money - wager;
			}
			
		}
		
		
	}
}
