package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex1 {

	/*
	 * Leia um n�mero, entre zero a dez. 
	 * Mostra mensagem de erro caso esteja fora do intervalo e pedi novamente o n�mero.
	 * [s� isso!]
	 */
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero = 0;
		while(numero < 1 || numero > 10) {
			System.out.print("Informe que esteja entre 1 e 10: ");
			numero = sc.nextInt();
		}
		
		sc.close();
	}

}
