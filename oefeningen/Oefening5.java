package oefeningen;

import java.util.Scanner;

public class Oefening5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int hoogste = 0;
		int tweedeHoogste = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("Geef getal %d in: ", i+1);
			int getal = scanner.nextInt();
			
			if(getal > hoogste) {
				tweedeHoogste = hoogste;
				hoogste = getal;
			} else {
				if(getal > tweedeHoogste) {
					tweedeHoogste = getal;
				}
			}
		}
		
		System.out.printf("Het op één na grootste getal is %d", tweedeHoogste);
		
	}
	
}
