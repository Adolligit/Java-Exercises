package application;

import java.util.Scanner;
import java.util.Locale;

public class Exx18 {
	/*
	 * Leia a quantidade de CD's comprado e valor de cada um. 
	 * Calcule e informe o valor total e o valor médio gasto em cada CD.
	 */
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double preco, media, total = 0;
		
		System.out.print("Quantos CD's você possui? ");
		int quantidadeCds = sc.nextInt();
		System.out.println("");
		System.out.println("Abaixo, informe o preço de cada um.");
		for(int i = 1; i <= quantidadeCds; i++) {
			System.out.printf("%d° CD: U$", i);
			preco = sc.nextDouble();
			total += preco;
		}
		
		media = total / quantidadeCds;
		
		System.out.println();
		System.out.printf("Valor total gasto: U$%.2f%n", total);
		System.out.printf("Valor medio gasto com cada CD: U$%.2f%n", media);
		
		sc.close();
	}
}