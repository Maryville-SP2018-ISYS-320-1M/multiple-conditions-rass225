import java.util.Scanner;

/*
ISYS 320
Name(s):
Date: 
*/

/*  What was the error?
 "==" must be replaced with "equals" so that the code would compile.
  
 */

public class P1_FavoriteColor {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.print("What is your favorite color? ");
		String name = console.next();
		
		if(name.equals("blue")) {
			System.out.println("Mine too!");
		}

	}

}
