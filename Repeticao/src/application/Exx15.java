package application;

import java.util.Scanner;

public class Exx15 {
	
	/*
	 * Leia várias idades e no final informe se a média destas idades esta é jovem, adulta ou idosa.
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
			System.out.printf("%dª idade: ", i);
			idade += sc.nextDouble();
		}
		
		media = idade / n;
		
		if(media < 25) {
			System.out.println("A média da população informada é de jovens.");
		}else if(media < 60) {
			System.out.println("A média da população informada é de adultos.");
		}else {
			System.out.println("A média da população informada é de idosos.");
		}
		
		sc.close();
	}
	
}
