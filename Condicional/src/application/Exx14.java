package application;

import java.util.Locale;
import java.util.Scanner;

public class Exx14 {

	/*
	 * Ler duas notas de um aluno, calcular a média e
	 * informar o conceito, assim como se ele foi aprovado ou reprovado.
	 * 
	 * Seguir os seguintes critérios de avaliação:
	 * - acima de 9.0, A;
	 * - || de 7.5, B;
	 * - || de 6.0, C;
	 * - || de 4.0, D;
	 * - || de 0, E;
	 * [Aprovado: A,B e C.]
	 */
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double media = (n1 + n2) / 2;
		
		System.out.printf("Sua média: %.2f.%n", media);
		System.out.println();
		if(media >= 6.0) {
			System.out.println("Você foi aprovado!");
			if(media >= 9.0) {
				System.out.println("Conceito: A.");
			}else if(media >= 7.5) {
				System.out.println("Conceito: B.");
			}else if(media >= 6.0) {
				System.out.println("Conceito: C.");
			}
		}else{
			System.out.println("Você infelizmente foi reprovado.");
			if(media >= 4.0) {
				System.out.println("Conceito: D");
			}else{
				System.out.println("Conceito: E");
			}
		}
		
		sc.close();
	}

}
