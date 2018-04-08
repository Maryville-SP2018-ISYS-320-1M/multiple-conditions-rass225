/*
	ISYS 320
	Name(s):
	Date: 
*/
import java.util.Scanner;
public class P5_ShapeChooser {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);		
		System.out.println("Would you like to draw triangle or a box?");
		String input = console.next();
	
		if (input.equalsIgnoreCase("tri")) {
			drawTri();
		} else if (input.equalsIgnoreCase("box")) {
			drawBox();
		} else {
			System.out.println("ERROR: Can't print this!");
		}
	}
	
	private static void drawBox() {
		for( int row = 1; row <=5; row++ ) {
			for( int col = 1; col <=9; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	private static void drawTri() {
		for( int row = 1; row <=5; row++ ) {
			for( int col = 1; col <= 5 - row; col++) {
				System.out.print(" ");
			}
			
			for( int col = 1; col <= 2 * row - 1; col++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
