/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Dog test = new Dog();
		System.out.println("what is your dog's name?");
		String name = sc.nextLine();
		System.out.println("what is your dog's age?");
		int age = sc.nextInt();
		
		Dog a = new Dog(name, age);
		
		a.printAge();
		test.printAge();
		
		a.Sleeping();
		test.Sleepingtoo();
	}
}