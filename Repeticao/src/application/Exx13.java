package application;

import java.util.Scanner;

public class Exx13{
	
	/* 	Leia um n�mero e informe os n�meros primos at� este. 
	 *	Mostrar tamb�m no n�mero de divis�es e os disores.
	 */
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int n, divisao = 0;
		String divisores = "";
		
		System.out.print("Informe um n�mero inteiro: ");
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			if(n > 1 && n % i == 0) {
				divisao++;
				divisores += String.valueOf(i) + " ";
			}
		}
		
		System.out.println();
		
		if(divisao == 2) {
			System.out.println(n + " � um n�mero primo.");
		}else {
			System.out.println(n + " n�o � um n�mero primo.");
		}
		System.out.println("Divis�es: " + divisao + ".");
		System.out.println("Divisores: " + divisores);
		
		sc.close();
	}
	
}