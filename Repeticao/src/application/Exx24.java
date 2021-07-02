package application;

import java.util.Scanner;

public class Exx24 {
	/* 	
	 * 	Leia um valor inteiro positivo N e imprima o calculo da seguinte soma: 
	 *	S = 1 + 1/2 + 1/3 + 1/4 + ... + 1/n
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Inteiro positivo: ");
		int inteiro = sc.nextInt();

		double soma = 1;
		System.out.print("S = 1 +");
		for(int i = 2; i <= inteiro; i++) {
			System.out.printf(" 1/%d ", i);
			soma += (double) 1/i;
			
			if(i != inteiro) System.out.print("+");
		}
		System.out.printf("%nS = %.2f", soma);
		
		
		sc.close();
	}
}