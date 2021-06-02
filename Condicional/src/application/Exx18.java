package application;

import java.util.Locale;
import java.util.Scanner;


public class Exx18 {
	/*
	 * Leia um número inteiro que seja menor que 1000 e imprima a quantidade de centena, dezena e unidade.
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();
		String subNumero = String.valueOf(numero);
		if(numero > 0 && numero < 1000) {
			if(numero / 100 > 0) {
				System.out.printf("%s centena(s), %s dezena(s) e %s unidade(s).%n", 
						subNumero.substring(0,1), subNumero.substring(1,2), subNumero.substring(2));
			}else if(numero / 10 > 0) {
				System.out.printf("%s dezena(s) e %s unidade(s).%n", 
						subNumero.substring(0,1), subNumero.substring(1));
			}else {
				System.out.printf("%s unidade(s).%n", 
						subNumero);
			}
		}
		
		sc.close();
	}
}