package oefeningen;

import java.util.Scanner;

public class Oefening3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int postcode = 0;

		do {
			System.out.print("Geef een postcode (4 cijfers): ");
			postcode = scanner.nextInt();
		} while (postcode < 1000 || postcode > 9999);

		String stad = switch (postcode) {
		case 9300 -> "Aalst";
		case 2000 -> "Antwerpen";
		case 1000 -> "Brussel";
		case 9200 -> "Dendermonde";
		case 9000 -> "Gent";
		case 8500 -> "Kortrijk";
		case 9700 -> "Oudenaarde";
		case 2300 -> "Turnhout";
		default -> null;
		};
		
		if(stad == null) {
			System.out.printf("Postnummer %d bestaat niet of komt overeen met een stad die niet in de tabel is opgenomen", postcode);
		} else {
			System.out.printf("Posnummer %d komt overeen met de stad %s", postcode, stad);
		}
		
		
		

	}
}
