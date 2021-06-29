package application;

import java.util.Locale;
import java.util.Scanner;

public class Exx22 {
	/*
	 * Leia o c�digo do lanche e a quantidade. Depois imprima o total a ser pago pelo usu�rio.
	 * Invente: nome do lanche, c�digo e pre�o
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo, quantidade = 0;
		char resposta;
		double valorTotal = 0;
		boolean erro = false;
		
		/* 
		 * %9s significa 9 casas atr�s e %-9s s�o 9 casas a frente,
		 * contando com o n�mero de letras
		 */
		System.out.printf("%-9s%-18s%s%n", "C�digo", "Especifica��o", "Pre�o");
		System.out.printf("%-9s%-18s%s%n", "300", "Cachorro Quente", "U$ 2,50");
		System.out.printf("%-9s%-18s%s%n", "303", "Bauru simples", "U$ 2,50");
		System.out.printf("%-9s%-18s%s%n", "306", "Bauru com ovo", "U$ 2,20");
		System.out.printf("%-9s%-18s%s%n", "309", "Hamb�rguer", "U$ 3,00");
		System.out.printf("%-9s%-18s%s%n", "312", "Cheeseburguer", "U$ 3,90");
		System.out.printf("%-9s%-18s%s%n", "315", "X-Bacon", "U$ 3,90");
		System.out.println("::::::::::::::::::::::::::::::::::::::::");
		System.out.println("A seguir, informe o c�digo correspondente ao lanche.");
		System.out.println();
		do {
			System.out.print("Qual lanche voc� gostaria de pedir? ");
			codigo = sc.nextInt();
			System.out.print("Quantos? ");
			quantidade = sc.nextInt();
			switch(codigo) {
			case 300:
				valorTotal += quantidade * 2.5; 
				break;
			case 303:
				valorTotal += quantidade * 2.5; 
				break;
			case 306:
				valorTotal += quantidade * 2.2; 
				break;
			case 309:
				valorTotal += quantidade * 3; 
				break;
			case 312:
				valorTotal += quantidade * 3.9; 
				break;
			case 315:
				valorTotal += quantidade * 3.9; 
				break;
			default:
				System.err.println("O c�digo informado � inv�lido. Por favor, tente novamente.");
				erro = true;
				break;
			}
			if(!erro) {
			System.out.print("Quer fazer mais um pedido (s/n)? ");
			resposta = sc.next().toLowerCase().charAt(0);
			}else {
				resposta = 's';
				erro = false;
			}
			System.out.println();
		}while(resposta == 's');
		
		System.out.println("::::::::::::::::::::::::::::::::::::::::");
		System.out.printf("Valor total: U$%.2f%n", valorTotal);
		
		sc.close();
	}
}