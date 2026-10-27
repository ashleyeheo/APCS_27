/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int x = 1;
		System.out.println("what is your name?");
		String name = sc.nextLine();
		
		System.out.println("what is you favorite number?");
		int numberone = sc.nextInt();
		
		while (x <= numberone) {
			System.out.println(x + ". " + name);
			x = x + 1;
		}
		



		
	}
}
