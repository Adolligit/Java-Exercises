package application;

import java.util.Scanner;

public class Ex4 {

	/*
	 * Calcule a área de um quadrado e depois imprima o dobro do resultado.
	 */
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		double lado = sc.nextDouble();
		double area = lado * lado;
		double resultado = area * 2;
		System.out.printf("%.2f", resultado);
		sc.close();
	}
}
