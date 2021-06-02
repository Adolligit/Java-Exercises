package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {
	
	/*
	 * Ler e informar se o valor é ou não positivo
	 */
	
	public static void main(String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		if(x % 2 == 0) System.out.println("Positivo");
		else System.out.println("Negativo");
		
		sc.close();
	}
}
