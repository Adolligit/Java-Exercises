package application;

import java.util.Scanner;

public class Ex1 {

	/*
	 * Ler as 4 notas e imprimir a média.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, n2, n3, n4, media;
		
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		n4 = sc.nextInt();

		media = (n1 + n2 + n3 + n4) / 4;
		
		System.out.println(media);

		sc.close();
	}
}
