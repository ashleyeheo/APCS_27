/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Donkey donkey = new Donkey("Jack", 4);
		System.out.println(donkey.getName());
		callName(donkey)
		Ogre shrek = new Ogre();
		if(shrek.isUgly()){
			String statement = new String(shrek.name + " IS UGLY!");
		}
		System.out.println(statement);
		donkey.interact(shrek);
		for(int i = 0; i < 5; i++){
			shrek.interact(donkey);
		}
		System.out.println("That printed out " + i + " times");

	}

	private callName(Donkey d) {
		d.getName();
	}
}
