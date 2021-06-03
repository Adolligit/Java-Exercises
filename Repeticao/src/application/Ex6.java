package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex6 {
	/*
	 * Leia 5 números e imprima a média e a soma deles
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double numero, soma = 0;
		
		for(int i=1; i <= 5; i++) {
			System.out.printf("Informe o %d° número: ", i);
			numero = sc.nextDouble();
			soma += numero;
		}

		System.out.println();
		System.out.printf("Soma: %.2f%n", soma);
		System.out.printf("Média: %.2f%n", soma/5);
		
		sc.close();
	}
}