/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	
		Random rand = new Random(); 
		int [] arr = new int[1000];
		int counter = 0;
		while(counter < 1001){
			int arrayValue = rand.nextInt(1000); 
			int arrayIndex = 0;
			arr [arrayIndex] = arrayValue; 
			System.out.print(arr[arrayIndex] + ", ");
			arrayIndex++;
			counter++;
		}
		}


		
	}

