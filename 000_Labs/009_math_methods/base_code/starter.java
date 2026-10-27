/*
 *	Author:  
 *  Date: 
*/




class starter {
	public static void main(String args[]) {
	
	
	Scanner sc = new Scanner(System.in);
		int a;
		double b;
		double c;
		double d;
		a = Math.max(13 - 6 * 11, 30 % 7 * (-2));
		b = Math.sqrt(27);
		c = Math.pow(12, 14);
		d = Math.max(Math.pow(2,2) , Math.sqrt(12));
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(" ");
		System.out.println("_______________________________________________________________");
		System.out.println(" ");
		System.out.println("Give me two numbers (ex: 13.0)");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		
		double one = Math.max(num1, num2);
		double two = Math.sqrt(num2);
		double three = Math.pow(num1, num2);
		
		System.out.println(" ");
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
	
	
	}
}
