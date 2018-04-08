/*
	ISYS 320
	Name(s):
	Date: 
*/
import java.util.Scanner;
public class P4_ColorNamer {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);		
		System.out.println("What should the color be called?");
		String input = console.next();
		
		if (input.equalsIgnoreCase("r") || input.equalsIgnoreCase("R"))	{
			System.out.println("The name is Red.") ;
		}
		else if (input.equalsIgnoreCase("g") || input.equalsIgnoreCase("G")){
			System.out.println("The name is Green.");
		}
		else if (input.equalsIgnoreCase("b") || input.equalsIgnoreCase("B")){
			System.out.println("The name is Blue.");
		}
		else{
			System.out.print("Error: I do not know what " + input + " is.");
		}
	}

}
