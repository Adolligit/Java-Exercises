package application;

import java.util.Locale;
import java.util.Scanner;

public class Exx17 {
	/*
	 * Peça o ano e informe se é ou não bissexto
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int ano = sc.nextInt();
		System.out.println();
		
		System.out.printf(ano % 4 == 0 ? "O ano '%d' é bissexto." : "O ano '%d' não é bissexto.", ano);
		
		sc.close();
	}
}