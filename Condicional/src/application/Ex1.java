package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex1 {
	
	/*
	 * Ler dois números e imprir o maior
	 */
	
	public static void main(String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x > y) System.out.println(x);
		else System.out.println(y);
		
		sc.close();
	}
}