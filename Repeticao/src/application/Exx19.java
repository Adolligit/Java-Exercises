package application;

import java.util.Scanner;

public class Exx19 {

	/*
	 * Fa�a uma tabuada. Leia tr�s n�meros e imprima o resultado.
	 * 1) multiplicando
	 * 2) primeiro multiplicador
	 * 3) �ltimo multiplicador
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Voc� quer a tabuada de qual n�mero? ");
		int multiplicando = sc.nextInt();
		System.out.print("Por qual multiplicador voc� quer come�ar? ");
		int primeiroMultiplicador = sc.nextInt();
		System.out.print("E qual o �ltimo multiplicador? ");
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
