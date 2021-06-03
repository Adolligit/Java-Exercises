package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {
	/*
	 * Leia 5 n�meros e informe o maior.
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero, maiorNumero = 0;
		for(int i = 1; i <= 5; i++) {
			System.out.printf("Informe o %d� n�mero: ", i);
			numero = sc.nextInt();
			if(numero > maiorNumero) maiorNumero = numero;
		}
		
		System.out.println();
		System.out.printf("%d � maior n�mero.", maiorNumero);
		
		sc.close();
	}
}