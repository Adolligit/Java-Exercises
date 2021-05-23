package application;

import java.util.Scanner;

public class Exx10 {

	/*
	 * Ler a altura da pessoa e exibir o calculo do peso ideal para homem e mulher.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double altura = sc.nextDouble();
		double mulher = altura*62.1 - 44.7;
		double homem = altura*72.7 - 58;
		System.out.printf("Mulher: %.2f%n", mulher);
		System.out.printf("Homem: %.2f", homem);
		
		sc.close();
	}

}
