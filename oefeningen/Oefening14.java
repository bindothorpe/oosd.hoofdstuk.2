package oefeningen;

import java.util.Scanner;

public class Oefening14 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int getal = -2001;
		int aantal = 0;
		
		while(getal != -2000) {
			System.out.print("Geef een geheel getal (-2000 om te stoppen): ");
			int i = scanner.nextInt();
			
			// Zodat het niet het eerste getal registreerd als een getal kleiner dan het vorige
			if(getal == -2001) {
				getal = i;
				continue;
			}
			
			// Zodat als de gebruiker het getal -2000 invoert het programma uit de while lus gaat
			if(i == -2000)
				break;
			
			
			// Als het ingevoerde getal (i) kleiner is dan het vorige getal (getal) gaan we het aantal optellen met 1
			if(i<getal) {
				aantal++;
				getal = i;
			}
				
		}
		
		System.out.printf("Het aantal getallen dat direct gevolgd wordt door een kleiner getal is %d", aantal);
	}
	
}
