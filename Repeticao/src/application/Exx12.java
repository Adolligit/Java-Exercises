package application;

import java.util.Scanner;

public class Exx12{
	
	// Leia um n�mero e informe se ele � primo
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);

		int n, div = 0;
		
		System.out.print("Informe um n�mero inteiro: ");
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			if(n > 1 && n % i == 0) {
				div++;
			}
		}
		
		if(div == 2) {
			System.out.println("Primo");
		}else {
			System.out.println("N�o � primo");
		}
		
		sc.close();
	}
}