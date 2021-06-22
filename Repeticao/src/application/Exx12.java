package application;

import java.util.Scanner;

public class Exx12{
	
	// Leia um número e informe se ele é primo
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);

		int n, div = 0;
		
		System.out.print("Informe um número inteiro: ");
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			if(n > 1 && n % i == 0) {
				div++;
			}
		}
		
		if(div == 2) {
			System.out.println("Primo");
		}else {
			System.out.println("Não é primo");
		}
		
		sc.close();
	}
}