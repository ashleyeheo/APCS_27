/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {

Scanner sc = new Scanner(System.in);
			int random;
			random = (int)(Math.random()*1000 + 1);
		System.out.println("Pick a number 1-1000:");
			int num = sc.nextInt();
			boolean x;
			x = (num == random);
		if (x) {
		System.out.println("congrats, you got it right");
		}
		else {
		System.out.println("wrong, the number was " + random);




	}
}
