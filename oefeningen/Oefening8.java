package oefeningen;

import java.util.Scanner;

public class Oefening8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int deler = 0;
		int deelbaar = 0;
		int aantal = 0;
		int getal = 0;

		do {
			System.out.print("Geef een strikt positieve deler in: ");
			deler = scanner.nextInt();
		} while (deler < 1);
		
		do {
			System.out.printf("Geef positief getal %d in (of stop met -1): ", aantal + 1);
			getal = scanner.nextInt();
			
			if(getal != -1) {
				if(getal%deler == 0)
					deelbaar++;
				
				aantal++;
			}
			
		} while (getal != -1);
		
		
		System.out.println(deelbaar == 1 ? "\nEr is 1 getal deelbaar door " + deler : "\nEr zijn " + deelbaar + " getallen deelbaar door " + deler);
	}

}
