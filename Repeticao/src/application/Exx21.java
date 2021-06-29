package application;

import java.util.Locale;
import java.util.Scanner;

public class Exx21 {
	/*
	 * O sal�rio de um funcion�rio em 1995 era de mil reais. Em 1996 ele recebeu um
	 * aumento de 1.5% e nos anos seguintes recebeu o dobro desta porcentagem. Leia
	 * o sal�rio de uma pessoa e imprima o quanto ela estaria ganhando, se tivesse
	 * sido contratada no mesmo ano do funcion�rio e recebesse o mesmo acrescimento
	 * do funcion�rio, at� o ano informado.
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Sal�rio de 1996: U$");
		double salario = sc.nextDouble();
		
		System.out.print("Ano: ");
		int ano = sc.nextInt();
		
		salario += salario * 0.015;
		
		for(int i = 1997; i <= ano; i++) {
			salario += salario * 0.03;
		}
		
		System.out.printf("Sal�rio de %d: U$%.2f", ano, salario);
		
		sc.close();
	}
}