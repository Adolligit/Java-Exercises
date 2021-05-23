package application;

import java.util.Scanner;

public class Ex9 {

	/*
	 * Ler a altura de uma pessoa e mostrar o resultado do calculo do seu peso ideal.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double altura = sc.nextDouble();
		double pesoIdeal = (72.7*altura) - 58;
		System.out.printf("%.2f.", pesoIdeal);
		sc.close();
	}

}
