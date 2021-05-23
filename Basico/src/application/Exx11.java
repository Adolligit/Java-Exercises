package application;

import java.util.Scanner;

public class Exx11 {

	/*
	 * Pescador
	 * O qu�lo de peixes m�ximo � 50.
	 * O pescador que exceder o limite paga R$4,00 por quilo excedido.
	 * 
	 * Leia a quantidade de qu�lo e imprima o resultado da multa a ser pago.
	 * Deve conter as vari�veis: peso, excesso e multa.
	 * Considere que sempre a pessoa receber� multa e desconsidere valores menores que 50.
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
