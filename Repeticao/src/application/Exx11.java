package application;

import java.util.Locale;
import java.util.Scanner;

public class Exx11 {
	/*
	 * Leia vários números e determine o menor, maior e a soma dos valores.
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, numero, soma, maior, menor;
		x = numero = soma = maior = menor = 0;
		
		System.out.print("Quantos números você quer informar a seguir? ");
		x = sc.nextInt();
		
		System.out.println();
		System.out.println("Por favor, informe somente números inteiros!");
		System.out.println();
		for(int i = 0; i < x; i++) {
			System.out.print((i+1) + "° número: ");
			numero = sc.nextInt();
			soma += numero;
			if(i == 0) {
				maior = menor = numero;
			}else {
				if(numero > maior) {
					maior = numero;
				}else if(numero < menor) {
						menor = numero;
				}
			}
		}
		
		System.out.println();
		System.out.printf("Soma: %d%n", soma);
		System.out.printf("Maior: %d | Menor: %d", maior, menor);
		
		sc.close();
	}
}