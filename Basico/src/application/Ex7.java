package application;

import java.util.Scanner;

public class Ex7 {

	/*
	 * Ler temperatura em Celsius e mostrar conversão em Fahrenheit.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double celsius = sc.nextDouble();
		double fahreinheit = 32 + (celsius * 9 / 5);
		System.out.printf("%.2f", fahreinheit);
		sc.close();
	}

}
