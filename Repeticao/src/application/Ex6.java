package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex6 {
	/*
	 * Leia 5 n�meros e imprima a m�dia e a soma deles
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double numero, soma = 0;
		
		for(int i=1; i <= 5; i++) {
			System.out.printf("Informe o %d� n�mero: ", i);
			numero = sc.nextDouble();
			soma += numero;
		}

		System.out.println();
		System.out.printf("Soma: %.2f%n", soma);
		System.out.printf("M�dia: %.2f%n", soma/5);
		
		sc.close();
	}
}