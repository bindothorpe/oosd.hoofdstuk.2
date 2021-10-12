package oefeningen;

import java.util.Scanner;

public class Oefening7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int deelbaarDoor2 = 0;
		int deelbaarDoor3 = 0;
		int deelbaarDoor6 = 0;

		int getal;

		System.out.print("Geef een positief geheel getal (stoppen met 0): ");

		getal = scanner.nextInt();

		while (getal != 0) {
			System.out.print("Geef een positief geheel getal (stoppen met 0): ");

			getal = scanner.nextInt();
			if (getal % 6 == 0) {

				if (getal % 2 == 0)
					deelbaarDoor2++;
				if (getal % 3 == 0)
					deelbaarDoor3++;
				deelbaarDoor6++;
			}
		}

		System.out.printf("Er zijn %d getallen deelbaar door 2%n", deelbaarDoor2);
		System.out.printf("Er zijn %d getallen deelbaar door 3%n", deelbaarDoor3);
		System.out.printf("Er zijn %d getallen deelbaar door 6%n", deelbaarDoor6);
	}

}
