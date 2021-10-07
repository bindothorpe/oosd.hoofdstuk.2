package oefeningen;

import java.util.Scanner;

public class Oefening15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int aantal = 0;
		
		while(true) {
			System.out.printf("Geef een geheel getal in (0 om te stoppen): ");
			int getal = scanner.nextInt();
			
			if(getal == 0)
				break;
			
			//We houden bij hoeveel delers het getal heeft
			//Als het meer dan 2 delers heeft dan is het geen priemgetal
			int aantalDelers = 0;
			
			for(int i = 1; i <= getal; i++) {
				if(getal%i == 0)
					aantalDelers++;
			}
			
			if(aantalDelers > 2) {
				//GEEN priemgetal
				
				System.out.printf("%d is GEEN priemgetal!%n", getal);
				
			} else {
				//EEN priemgetal

				System.out.printf("%d is EEN priemgetal!%n", getal);
				aantal++;
			}
		}
		
		System.out.printf("Het aantal priemgetallen is %d", aantal);
	}
	
}
