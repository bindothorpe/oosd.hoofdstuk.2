package oefeningen;

import java.util.Scanner;

public class Oefening6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int getal;

		do {
			System.out.print("Geef een strikt positief geheel getal in: ");
			getal = scanner.nextInt();
		} while (getal < 1);

		String delers = "";

		for (int i = 1; i <= getal; i++) {
			
			if (getal % i == 0) {
				
				if (i != getal) {
					delers += " " + i;
				} else {
					delers += " en " + i;
				}
				
			}
		}

		System.out.println("De delers zijn:" + delers);

	}

}
