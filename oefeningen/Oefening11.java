package oefeningen;

import java.util.Scanner;

public class Oefening11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Geef een geheel getal in: ");
		int getal = scanner.nextInt();
		
		System.out.println(getal%2 == 0 ? "Het ingevoerde getal " + getal + " is een even getal" : "Het ingevoerde getal " + getal + " is een oneven getal");
	}
	
}
