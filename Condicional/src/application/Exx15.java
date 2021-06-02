package application;

import java.util.Locale;
import java.util.Scanner;

public class Exx15 {
	/*
	 * Ler três valores e informar se é um triângulo e qual.
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double z = sc.nextDouble();
		
		if(x + y > z && x + z > y && y + z > x)
			if(x == y && y == z)
				System.out.println("Triângulo equilátero");
			else if(x == y || x == z || y == z)
				System.out.println("Triângulo Isósceles");
			else System.out.println("Triângulo escaleno");
		else System.out.println("Os valores não formam um triângulo.");
		sc.close();
	}
}