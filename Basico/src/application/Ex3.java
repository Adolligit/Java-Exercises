package application;

import java.util.Scanner;

public class Ex3 {

	/*
	 * Ler o raio de um c�rculo e imprima sua �rea
	 */
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		double raio = sc.nextDouble();
		double area = 3.14159 * raio * raio;
		System.out.printf("%.2f%n", area);
		sc.close();
	}
}
