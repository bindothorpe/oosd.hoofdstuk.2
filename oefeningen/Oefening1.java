package oefeningen;

import java.util.Scanner;

public class Oefening1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x,y,z;
		
		System.out.print("Geef het eerste getal: ");
		x = scanner.nextInt();
		
		System.out.print("Geef het tweede getal: ");
		y = scanner.nextInt();
		
		System.out.print("Geef het derde getal: ");
		z = scanner.nextInt();
		
		int som = x+y+z;
		
		int grootste = x;
		if(y > grootste)
			grootste = y;
		
		if(z > grootste) 
			grootste = z;
		
		System.out.printf("Van de ingevoerde getallen %d, %d en %d %nis de som %d%n", x, y, z, som);
		System.out.println("het gemiddelde is " + som/3);
		System.out.println("de rest is " + som%3);
		System.out.println("en het grootste getal " + grootste);
		
	}
	
}
