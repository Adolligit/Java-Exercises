package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex6 {
	
	/*
	 * Ler três número e exibir o maior
	 */
	
	public static void main(String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double z = sc.nextDouble();
		
		if(x > y && x > z) System.out.println(x);
		else if(y > z) System.out.println(y);
		else System.out.println(z);
			
		sc.close();
	}
}
