package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex7 {

	/*
	 * Ler três valores e informar o maior e menor
	 */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double z = sc.nextDouble();

		if (x > y && x > z)
			if (y > z)
				System.out.println("Maior: " + x + ". Menor:" + z + ".");
			else
				System.out.println("Maior: " + x + ". Menor:" + y + ".");
		else if (y > x && y > z)
			if (x > z)
				System.out.println("Maior: " + y + ". Menor:" + z + ".");
			else
				System.out.println("Maior: " + y + ". Menor:" + x + ".");
		else
			if (x > y)
				System.out.println("Maior: " + z + ". Menor:" + y + ".");
			else
				System.out.println("Maior: " + z + ". Menor:" + x + ".");
		sc.close();
	}
}
