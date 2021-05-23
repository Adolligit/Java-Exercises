package application;

import java.util.Scanner;

public class Ex5 {

	/*
	 * Ler preço por hora e horas trabalhadas no mês.
	 * Calcular e mostrar o salário do mês.
	 */
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		double precoHora = sc.nextDouble();
		int hora = sc.nextInt();
		double salario = precoHora * hora;
		System.out.printf("R$%.2f", salario);
		sc.close();
	}
}
