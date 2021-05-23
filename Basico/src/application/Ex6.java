package application;

import java.util.Scanner;

public class Ex6 {

	/*
	 * Ler temperatura em Fahrenheit e mostrar conversão em Celsius.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double fahreinheit = sc.nextDouble();
		double celsius = 5 * ((fahreinheit - 32)/9);
		System.out.printf("%.2f",celsius);
		sc.close();
	}

}
