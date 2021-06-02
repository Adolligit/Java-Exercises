package application;

import java.util.Locale;
import java.util.Scanner;

public class Exx17 {
	/*
	 * Pe�a o ano e informe se � ou n�o bissexto
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int ano = sc.nextInt();
		System.out.println();
		
		System.out.printf(ano % 4 == 0 ? "O ano '%d' � bissexto." : "O ano '%d' n�o � bissexto.", ano);
		
		sc.close();
	}
}