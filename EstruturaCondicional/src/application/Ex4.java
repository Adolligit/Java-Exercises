package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {
	
	/*
	 * Ler uma letra e informar se ela é consoante ou vogal
	 */
	
	public static void main(String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char letra = sc.next().charAt(0);
		
		if(letra == 'a' || letra == 'e' || letra == 'i' || letra =='o' || letra == 'u')
			System.out.printf("A letra '%c' é uma vogal", letra);
		else if(letra == 'A' || letra == 'E' || letra == 'I' || letra =='O' || letra == 'U')
			System.out.printf("A letra '%c' é uma vogal", letra);
		else
			System.out.printf("A letra '%c' é uma consoante.", letra);
		
		sc.close();
	}
}
