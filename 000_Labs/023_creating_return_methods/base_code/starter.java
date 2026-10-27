/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
		
		System.out.println("what is your base number?");
		int base = sc.nextInt();
		
		System.out.println("what is your exponent?");
		int exponent = sc.nextInt();
		
		System.out.println("this is your final number: " + (int)exponent(base, exponent));
	}
	public static double exponent(int a, int b) {
		double finalnumber;
		finalnumber = Math.pow(a,b);
		finalnumber = (int)finalnumber;
		return finalnumber;



		
	}
}
