package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {
	/*
	 * Calcular e imprimir a quantidade de anos que o país A, de 80mil habitantes, 
	 * conseguirá igualar e ultrapassar o país B, de 200mil habitantes.
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = 80000, b = 200000, ano = 1;
		while (a < b) {
			ano++;
			a += a * 0.03;
			b += b * 0.015;
		}
		System.out.printf("%d anos para igualar e %d anos para ultrapassar.", ano, ano+1);
		
		sc.close();
	}
}