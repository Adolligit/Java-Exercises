package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex8 {
	/*
	 * Leia dois números e imprima uma tabuada.
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Multiplicando: ");
		int x = sc.nextInt();
		System.out.print("Último número multiplicador: ");
		int y = sc.nextInt();
		
		System.out.println();
		System.out.println("::: TABUADA :::");
		for(int i = 1 ; i <= y; i++) {
			System.out.printf("   %d x %d = %d   %n", x, i, x*i);
		}
		
		sc.close();
	}
}