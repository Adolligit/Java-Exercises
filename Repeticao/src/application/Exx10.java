package application;

import java.util.Locale;
import java.util.Scanner;

public class Exx10 {

	/*
	 * Leia um número e calcule seu fatorial.
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		long numero, auxiliar;
	
		auxiliar = numero = sc.nextInt();
		
		for(int i = 1; i < numero; i++) {
			auxiliar = auxiliar * i;
		}
		
		System.out.println();
		System.out.println(auxiliar);
		
		sc.close();
	}

}
