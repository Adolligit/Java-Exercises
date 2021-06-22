package application;

import java.util.Locale;
import java.util.Scanner;

public class Exx14 {

	/*
	 * Leia v�rias notas e imprima a m�dia aritm�tica
	 */
	
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double media = 0;
		
		System.out.print("Ler quantas notas? ");
		n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.print(i + "� nota:");
			media += sc.nextDouble();
		}
		
		System.out.printf("M�dia: %.2f", media / n);
		
		sc.close();
	}
}
