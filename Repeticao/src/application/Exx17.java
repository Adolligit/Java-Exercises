package application;

import java.util.Scanner;

public class Exx17 {

	/*
	 * Alunos m�dio por turma: leia a quantidade de turma e alunos. 
	 * Imprima a m�dia de alunos por turmas. 
	 * Uma turma n�o pode ter mais que 40 alunos.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int turmas, alunos;
		double media = 0;
		
		System.out.print("Quantas turmas? ");
		turmas = sc.nextInt();
		
		for(int i = 0; i < turmas; i++) {
			do {
			System.out.printf("%d� turmar. Quantos alunos? ", i + 1);
				alunos = sc.nextInt();
				if(alunos > 40) {
					System.err.println("A quantidade m�xima de alunos por turmar � de 40.");
				}else {
					media += alunos;
				}
			}while(alunos > 40);
		}
		
		System.out.println();
		System.out.printf("M�dia de alunos por turma: %.2f. ", (media / turmas));
		
		sc.close();
	}
}