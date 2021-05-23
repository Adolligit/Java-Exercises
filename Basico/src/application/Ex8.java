package application;

import java.util.Scanner;

public class Ex8 {

	/*
	 * Ler dois números inteiros e um real.
	 * Calcular e mostrar:
	 * 	a) o produto do dobro do primeiro com metade do segundo.
	 * 	b) a soma do triplo do primeiro com o terceiro.
	 * 	c) o terceiro elevado ao cubo.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v1,v2; double v3, a, b, c;
		v1 = sc.nextInt();
		v2 = sc.nextInt();
		v3 = sc.nextDouble();
		a = v1 * 2 * v2 / 2;
		b = v1 * 3 + v3;
		c = v3 * v3 * v3;
		System.out.printf("a) %.2f%n", a);
		System.out.printf("b) %.2f%n", b);
		System.out.printf("c) %.2f%n", c);
		sc.close();
	}

}
