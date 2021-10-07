package oefeningen;

import java.util.Scanner;

public class Oefening4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Geef een afstand in kilometer: ");
		
		int afstand = scanner.nextInt();
		
		for(int snelheid = 40; snelheid <= 140; snelheid+= 10) {
			
			//              35      40
			int uren = afstand/snelheid;
			int minuten = afstand%snelheid*60/snelheid;
			
			System.out.printf("%8d km %8d km/u %8d u %2d min%n", afstand, snelheid, uren, minuten);
		}
	}
	
}
