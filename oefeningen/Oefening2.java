package oefeningen;

import java.util.Scanner;

public class Oefening2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Geef een geheel getal in: ");
		int getal = scanner.nextInt();

		if (getal == 0) {
			getal++;
			System.out.println("Het gegeven getal was 0 en werdt vermeerderd met 1");
			
		} else {
			if(getal > 0) {
				getal -= 10;
				System.out.println("Het ingegeven getal was strikt positief en werdt verminderd met 10.");
				System.out.println("Het heeft nu de waarde " + getal);
			} else {
				getal += 10;
				System.out.println("Het ingegeven getal was strikt negatief en werdt vermeerderd met 10.");
				System.out.println("Het heeft nu de waarde " + getal);
			}
		}
		
		

	}
}
