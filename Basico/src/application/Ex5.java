package application;

import java.util.Scanner;

public class Ex5 {

	/*
	 * Ler pre�o por hora e horas trabalhadas no m�s.
	 * Calcular e mostrar o sal�rio do m�s.
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
