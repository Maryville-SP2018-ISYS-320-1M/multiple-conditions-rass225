/*
	ISYS 320
	Name(s):
	Date: 
*/
import java.util.Scanner;
public class P6_Quadrant {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);		
		System.out.println("What is your x value? ");
		double x = console.nextDouble();
	
		System.out.println("What is your y value? ");
		double y = console.nextDouble();
		
		if (x > 0 && y > 0) {
			System.out.println("Your coordinates are in Quadrant I");
		} else if (x < 0 && y > 0) {
			System.out.println("Your coordinates are in Quadrant II");
		} else if (x < 0 && y < 0) {
			System.out.println("Your coordinates are in Quadrant III");
		} else {
			System.out.println("Your coordinates are in Quadrant IV");
		}
	
	}

}
