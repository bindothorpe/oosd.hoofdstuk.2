package oefeningen;

import java.util.Scanner;

public class Oefening10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Geef de teller van de breuk: ");
		int teller = scanner.nextInt();
		
		System.out.print("Geef de noemer van de breuk: ");
		int noemer = scanner.nextInt();
		
		
		int rest = teller%noemer;
		
		System.out.printf("%d/%d = %d%n", teller, noemer, teller/noemer);
		System.out.printf("rest = %d", rest);
		
		
		if(rest == 0) {
			teller = teller / noemer;
			noemer = noemer / noemer;
			
			System.out.printf("%n%nvereenvoudigde breuk = %d / %d", teller, noemer);
		}
		
		
	}
	
}
