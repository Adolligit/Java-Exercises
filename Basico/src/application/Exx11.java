package application;

import java.util.Scanner;

public class Exx11 {

	/*
	 * Pescador
	 * O quílo de peixes máximo é 50.
	 * O pescador que exceder o limite paga R$4,00 por quilo excedido.
	 * 
	 * Leia a quantidade de quílo e imprima o resultado da multa a ser pago.
	 * Deve conter as variáveis: peso, excesso e multa.
	 * Considere que sempre a pessoa receberá multa e desconsidere valores menores que 50.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("K(g): ");
		double peso = sc.nextDouble();
		double excesso = peso - 50;
		double multa = excesso * 4;
		
		System.out.printf("Multa: R$%.2f.", multa);
		
		sc.close();
	}

}
