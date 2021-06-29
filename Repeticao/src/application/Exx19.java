package application;

import java.util.Scanner;

public class Exx19 {

	/*
	 * Faça uma tabuada. Leia três números e imprima o resultado.
	 * 1) multiplicando
	 * 2) primeiro multiplicador
	 * 3) último multiplicador
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Você quer a tabuada de qual número? ");
		int multiplicando = sc.nextInt();
		System.out.print("Por qual multiplicador você quer começar? ");
		int primeiroMultiplicador = sc.nextInt();
		System.out.print("E qual o último multiplicador? ");
		int ultimoMultiplicador = sc.nextInt();
		System.out.println();

		int resultado = 0;
		for(int i = primeiroMultiplicador; i <= ultimoMultiplicador; i++) {
			resultado = multiplicando * i;
			System.out.printf("%d x %d = %d%n", multiplicando, i, resultado);
		}
		
		sc.close();
	}

}
