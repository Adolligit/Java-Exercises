package application;

import java.util.Scanner;

public class Ex3 {

	/*
	 * Ler o raio de um círculo e imprima sua área
	 */
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		double raio = sc.nextDouble();
		double area = 3.14159 * raio * raio;
		System.out.printf("%.2f%n", area);
		sc.close();
	}
}
