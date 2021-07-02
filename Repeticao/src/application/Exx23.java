package application;

import java.util.Locale;
import java.util.Scanner;

public class Exx23 {

	
	// Leia um número inteiro positvo e imprima o mesmo ao contrário.
	
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inteiro positivo: ");
		String inteiro = sc.next();
		if(Integer.parseInt(inteiro) < 0) {
			System.err.println("O número informado é negativo!");
		}else {
			System.out.print("Ao contrário: ");
			for(int i = inteiro.length() - 1; i >= 0; i--) {
				if(inteiro.charAt(i) == '+') continue;
				System.out.print(inteiro.charAt(i));
			}
		}
		
		sc.close();
	}
}
