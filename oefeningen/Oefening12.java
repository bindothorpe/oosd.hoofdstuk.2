package oefeningen;

import java.util.Scanner;

public class Oefening12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int antwoord1 = 0;
		int antwoord2 = 0;
		int antwoord3 = 0;
		int antwoord4 = 0;

		for (int i = 0; i < 15;) {
			System.out.printf("Geef antwoord %d in (1, 2, 3 of 4): ", i + 1);
			int getal = scanner.nextInt();

			switch (getal) {
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

			i++;
		}
		
		System.out.printf("Aantal 1: %d%n", antwoord1);
		System.out.printf("Aantal 2: %d%n", antwoord2);
		System.out.printf("Aantal 3: %d%n", antwoord3);
		System.out.printf("Aantal 4: %d%n", antwoord4);

	}

}
