package oefeningen;

import java.util.Scanner;

public class Oefening13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int antwoord1 = 0;
		int antwoord2 = 0;
		int antwoord3 = 0;
		int antwoord4 = 0;

		int index = 0;
		int getal = -1; 
		
		while (getal != 0) {
			System.out.printf("Geef antwoord %d in (1, 2, 3 of 4), STOP met 0: ", index + 1);
			getal = scanner.nextInt();

			switch (getal) {
			case 0:
				getal = 0;
				continue;
			
			case 1:
				antwoord1++;
				break;
			case 2:
				antwoord2++;
				break;
			case 3:
				antwoord3++;
				break;
			case 4:
				antwoord4++;
				break;
			default:
				System.out.println("Foutieve waarde! Probeer opnieuw!");
				continue;
			}

			index++;
		}
		
		System.out.printf("Aantal 1: %d%n", antwoord1);
		System.out.printf("Aantal 2: %d%n", antwoord2);
		System.out.printf("Aantal 3: %d%n", antwoord3);
		System.out.printf("Aantal 4: %d%n", antwoord4);

	}

}
