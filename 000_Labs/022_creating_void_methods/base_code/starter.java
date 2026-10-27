/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
		
		System.out.println("please input a sentence");
		String sentence1 = sc.nextLine();
		System.out.println("please input another sentence");
		String sentence2 = sc.nextLine();
		
		System.out.println("this is using the methods!");
		giga(sentence1);
		pico(sentence1, sentence2);


		
	}
	public static void giga(String String1) {
		System.out.println(String1);
	}
	public static void pico(String String1, String String2) {
		System.out.println(String1 + String2);


		
	}
}
