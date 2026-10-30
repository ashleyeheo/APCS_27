/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class Donkey {
	private String name;
	private int age;

	private Donkey(String a) {
		name = a;
		age = 0;
	}
	private Donkey(String n, int a) {
		name = n;
		age = a;
	}

	private String getName(){
		return name;
	}

	public void interact(Ogre shrek){
		System.out.println(shrek.name + ", parfaits may be the most delicious thing on the whole planet!");
		return;
	}



}
