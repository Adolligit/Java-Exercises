package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {
	
	/*
	 * Ler duas notas de um aluno e calcular a m�dia.
	 * Exibir se ele foi 'aprovado', 'aprovado com distin��o' ou 'reprovado'
	 * - Aprovado: m�dia >= 7;
	 * - Distin��o: m�dia = 10; 
	 * - Reprovado: m�dia < 7;
	 */
	
	public static void main(String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double media = (nota1 + nota2) / 2;
		if(media == 10) System.out.println("Aprovado com distin��o!");
		else if(media >= 7) System.out.println("Aprovado!");
		else System.out.println("Reprovado.");
		
		sc.close();
	}
}
