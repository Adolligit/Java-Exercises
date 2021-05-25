package application;

import java.util.Locale;
import java.util.Scanner;

public class Exx19 {
	
	/*
	 * Leia o valor a ser sacado por uma pessoa e informe quantidade de cada cédula e centavo que será fornecida. 
	 * O valor mínimo de saque é de R$3,00 e o máximo de R$1500,00.
	 * - Cédula: 2, 5, 10, 20, 50, 100 e 200.
	 * - Centavo: 0.01, 0.05, 0.10, 0.25, 0.50 e 1.
	 * 
	 * [SOMENTE COM IFELSE]
	 */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int quantidade;
		double saque, moeda;
		
		System.out.print("Informe o valor de saque: R$");
		saque = sc.nextDouble();
		System.out.println();
		
		if(saque >= 3 && saque <= 1500) {
			System.out.println("Saque realizado com êxito!");
			System.out.println();
			System.out.println("==== CÉDULA ====");
			if(saque >= 200) {
				moeda = 200;
				quantidade = (int) (saque / moeda);
				saque -= quantidade * moeda;
				System.out.printf("R$%-12.2f%dx%n", moeda, quantidade);
			}
			if(saque >= 100) {
				moeda = 100;
				quantidade = (int) (saque / moeda);
				saque -= quantidade * moeda;
				System.out.printf("R$%-12.2f%dx%n", moeda, quantidade);
			}
			if(saque >= 50) {
				moeda = 50;
				quantidade = (int) (saque / moeda);
				saque -= quantidade * moeda;
				System.out.printf("R$%-12.2f%dx%n", moeda, quantidade);
			}
			if(saque >= 20) {
				moeda = 20;
				quantidade = (int) (saque / moeda);
				saque -= quantidade * moeda;
				System.out.printf("R$%-12.2f%dx%n", moeda, quantidade);
			}
			if(saque >= 10) {
				moeda = 10;
				quantidade = (int) (saque / moeda);
				saque -= quantidade * moeda;
				System.out.printf("R$%-12.2f%dx%n", moeda, quantidade);
			}
			if(saque >= 5) {
				moeda = 5;
				quantidade = (int) (saque / moeda);
				saque -= quantidade * moeda;
				System.out.printf("R$%-12.2f%dx%n", moeda, quantidade);
			}
			if(saque >= 2) {
				moeda = 2;
				quantidade = (int) (saque / moeda);
				saque -= quantidade * moeda;
				System.out.printf("R$%-12.2f%dx%n", moeda, quantidade);
			}
			
			if(saque >= 1) {
				System.out.println("==== CENTAVO ====");
				moeda = 1;
				quantidade = (int) (saque / moeda);
				saque -= quantidade * moeda;
				System.out.printf("R$%-12.2f%dx%n", moeda, quantidade);
			}
			if(saque >= 0.5) {
				moeda = 0.5;
				quantidade = (int) (saque / moeda);
				saque -= quantidade * moeda;
				System.out.printf("R$%-12.2f%dx%n", moeda, quantidade);
			}
			if(saque >= 0.25) {
				moeda = 0.25;
				quantidade = (int) (saque / moeda);
				saque -= quantidade * moeda;
				System.out.printf("R$%-12.2f%dx%n", moeda, quantidade);
			}
			if(saque >= 0.1) {
				moeda = 0.1;
				quantidade = (int) (saque / moeda);
				saque -= quantidade * moeda;
				System.out.printf("R$%-12.2f%dx%n", moeda, quantidade);
			}
			if(saque >= 0.05) {
				moeda = 0.05;
				quantidade = (int) (saque / moeda);
				saque -= quantidade * moeda;
				System.out.printf("R$%-12.2f%dx%n", moeda, quantidade);
			}
			if(saque >= 0.01) {
				moeda = 0.01;
				quantidade = (int) (saque / moeda);
				saque -= quantidade * moeda;
				System.out.printf("R$%-12.2f%dx%n", moeda, quantidade);
			}
			
		}else {
			System.err.print("ERRO:");
			System.out.println(" Valor incompatível para saque!");
		}
		
		sc.close();
	}

}
