package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex8 {

	/*
	 * Ler o preço de três produtos e informar o mais barato
	 */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double p1 = sc.nextDouble();
		double p2 = sc.nextDouble();
		double p3 = sc.nextDouble();
		
		if(p1 < p2 && p1 < p3) System.out.printf("R$%.2f.",p1);
		else if(p2 < p3) System.out.printf("R$%.2f.",p2);
		else System.out.printf("R$%.2f.",p3);
		
		sc.close();
	}
}
