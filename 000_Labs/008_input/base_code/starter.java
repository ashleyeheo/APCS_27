/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("what is your name? ");
		String name = sc.nextLine();
	System.out.println("how old are you? ");
		int age = sc.nextInt();
	System.out.println("what month were you born in? ");
	System.out.println();	
		String birthdayMonth = sc.nextLine();
	System.out.println("what day were you born on? ");
		int birthdayDay = sc.nextInt();
	System.out.println("what year were you born in? ");
		int birthdayYear = sc.nextInt();	
	System.out.println("how much is a buck fifty? ");
		double buckFifty = sc.nextDouble();
	System.out.println("your name is " + name + "."); 
	System.out.println("you are " + age + " years old.");
	System.out.println("you were born on " + birthdayMonth + " " + birthdayDay + " " + birthdayYear + ".");
	System.out.println("a buck fifty is " + buckFifty);	




	}
}
