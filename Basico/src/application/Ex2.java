package application;

import java.util.Scanner;

public class Ex2 {
	
	/*
	 * Ler m�tros e imprimir em cent�metros.
	 */
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		double metro = sc.nextDouble();
		double centimetro = metro * 100;
		System.out.println(centimetro);
		sc.close();
	}
}
