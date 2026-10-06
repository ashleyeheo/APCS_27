/*
 *	Author:
 *  Date:
 * 	Collaborator:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {

Scanner sc = new Scanner(System.in); 
System.out.println("the goal of the game is to guess a word with two hints");		
System.out.println("do you want a hint");
System.out.println("1 for yes, 2 for no");
 int yesornoone = sc.nextInt(); 

if(int yesornoone == 1)
{
	System.out.println("it is a multiple of 9");
	System.out.print("what is your guess");
	int yesornotwo = sc.nextInt();
}

if(int yesornoone == 2)
{
	System.out.print("ok what is your guess");
	int yesornothree = sc.nextInt();

}




	}
}
