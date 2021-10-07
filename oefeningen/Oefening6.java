package oefeningen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Oefening6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean isValidNumber = false;
		
		int getal = 0;
		
		while (!isValidNumber) {
			System.out.print("Geef een strikt positief geheel getal in: ");
			
			getal = scanner.nextInt();
			
			if(getal >= 0)
				isValidNumber = true;
		}

		String delers = "";
		
		for(int i = 1; i <= getal; i++) {
			if(getal%i == 0) {
				if(i != getal) {
					delers += " " + i;
				} else {
					delers += " en " + i;
				}
			}
		}
		
		System.out.println("De delers zijn:" + delers);
		
		
		
		
	}
	
}
