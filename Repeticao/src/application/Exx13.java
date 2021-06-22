package application;

import java.util.Scanner;

public class Exx13{
	
	/* 	Leia um número e informe os números primos até este. 
	 *	Mostrar também no número de divisões e os disores.
	 */
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int n, divisao = 0;
		String divisores = "";
		
		System.out.print("Informe um número inteiro: ");
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			if(n > 1 && n % i == 0) {
				divisao++;
				divisores += String.valueOf(i) + " ";
			}
		}
		
		System.out.println();
		
		if(divisao == 2) {
			System.out.println(n + " é um número primo.");
		}else {
			System.out.println(n + " não é um número primo.");
		}
		System.out.println("Divisões: " + divisao + ".");
		System.out.println("Divisores: " + divisores);
		
		sc.close();
	}
	
}