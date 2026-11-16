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
		for(int i = 0; i<1001; i++){
			int x = rand.nextInt(1000); 
			int y = 0;
			arr [y] = x; 
			System.out.print(arr[y] + ", ");
			y++;
		}


		
	}
}
