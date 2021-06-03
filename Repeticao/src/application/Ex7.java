package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex7 {
	/*
	 * Imprima números impares de 1 a 50
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i < 50; i++) {
			if(i % 2 != 0) System.out.println(i);
		}
		
		sc.close();
	}
}