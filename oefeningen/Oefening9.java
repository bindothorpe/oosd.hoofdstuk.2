package oefeningen;

import java.util.Scanner;

public class Oefening9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int stappen = 0;
		int getal = -1;
		
		
		do {
			System.out.print("Geef een strikt positief getal in: ");
			getal = scanner.nextInt();
		} while (getal < 1);
		
		while(getal != 1) {
			if(getal%2==0) {
				getal /= 2;
			} else {
				getal *= 3;
				getal++;
			}
			
			stappen++;
		}
		
		System.out.println(stappen == 1 ? "Het getal wijzigt 1 keer" : "Get getal wijzigt " + stappen + " keren");
		
	}
	
}
