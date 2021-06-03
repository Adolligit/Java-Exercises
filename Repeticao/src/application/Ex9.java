package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex9 {
	/*
	 * Leia um n�mero e imprima a s�rie Fibonacci at� ele.
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		long a = 0, b = 1, c = 0, numero = 0;
		
		System.out.println(":::::: Sequ�ncia de Fibonacci ::::::");
		System.out.print("Informe um n�mero: ");
		numero = sc.nextInt();
		
		System.out.println();
		
		for(int i = 1; i <= numero; i++) {
			System.out.printf("%d", a);
			if(i < numero) System.out.print(", ");
			c = a + b;
			a = b;
			b = c;
		}
		
		sc.close();
	}
}