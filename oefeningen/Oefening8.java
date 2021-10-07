package oefeningen;

import java.util.Scanner;

public class Oefening8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int deler = -1;
		int deelbaar = 0;

		while (deler <= -1) {
			System.out.print("Geef een strikt positieve deler in: ");
			int getal = scanner.nextInt();

			if (getal != -1 && getal > 0)
				deler = getal;
		}
		
		int aantal = 1;
		
		while(true) {
			System.out.printf("Geef positief getal %d in (of stop met -1): ", aantal);
			int getal = scanner.nextInt();
			
			if(getal == -1)
				break;
			
			if(getal%deler == 0)
				deelbaar++;
			
			aantal++;
		}
		
		System.out.println(deelbaar == 1 ? "\nEr is 1 getal deelbaar door " + deler : "\\nEr zijn " + deelbaar + " getallen deelbaar door " + deler);
	}

}
