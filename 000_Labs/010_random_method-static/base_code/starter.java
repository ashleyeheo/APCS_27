/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		double numberone;
		double numbertwo;
		double numberthree;
		double numberfour;
		numberone = Math.random()*10;
		numbertwo = Math.random()*10 + 1;
		numberthree = Math.random()+ 2.5;
		numberfour = Math.random()*575 + 14;
		numberone = (int)numberone;
		numbertwo = (int)numberthree;
		System.out.println("A number between 0-9: " + (int)numberone);
		System.out.println("A number between 1-10: " + (int)numbertwo);
		System.out.println("A double between 2.5-3.5: " + numberthree);
		System.out.println("A double between 14-589: " + numberfour);


		
		
	}
}
