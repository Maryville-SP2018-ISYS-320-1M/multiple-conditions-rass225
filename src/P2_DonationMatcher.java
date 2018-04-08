import java.util.Scanner;

public class P2_DonationMatcher {

	public static void main(String[] args) {

		int donationsSum = 1000;
		int donationsCount = 20;
		Scanner console = new Scanner(System.in);
		System.out.print("Will you donation be multiplied 1 or 2? ");
		int multiplier = console.nextInt();

		System.out.print("And how much are you donating? ");
		int donation = console.nextInt();
			
		if (multiplier == 1 || multiplier == 2) {
		
		donationsSum = donationsSum + (multiplier * donation);
			donationsCount++;
		} else {
			System.out.print("Error");
		}
		System.out.println("Total donated sum: " + donationsSum);
		System.out.println("Total number of donations: " + donationsCount);
	}

}
