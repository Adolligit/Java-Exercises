package application;

import java.util.Scanner;

public class Exx15 {
	
	/*
	 * Leia v�rias idades e no final informe se a m�dia destas idades esta � jovem, adulta ou idosa.
	 * idade < 25: jovem;
	 * idade <= 60: adulta;
	 * idade != || :  idosa; 
	 */
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		double idade = 0, media = 0;
		int n;
		
		System.out.print("Ler quantas idades? ");
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.printf("%d� idade: ", i);
			idade += sc.nextDouble();
		}
		
		media = idade / n;
		
		if(media < 25) {
			System.out.println("A m�dia da popula��o informada � de jovens.");
		}else if(media < 60) {
			System.out.println("A m�dia da popula��o informada � de adultos.");
		}else {
			System.out.println("A m�dia da popula��o informada � de idosos.");
		}
		
		sc.close();
	}
	
}
