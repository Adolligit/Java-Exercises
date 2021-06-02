package application;

import java.util.Locale;
import java.util.Scanner;

public class Exx15 {
	/*
	 * Ler tr�s valores e informar se � um tri�ngulo e qual.
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double z = sc.nextDouble();
		
		if(x + y > z && x + z > y && y + z > x)
			if(x == y && y == z)
				System.out.println("Tri�ngulo equil�tero");
			else if(x == y || x == z || y == z)
				System.out.println("Tri�ngulo Is�sceles");
			else System.out.println("Tri�ngulo escaleno");
		else System.out.println("Os valores n�o formam um tri�ngulo.");
		sc.close();
	}
}