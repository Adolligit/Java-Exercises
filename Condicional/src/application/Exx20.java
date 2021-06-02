package application;

import java.util.Locale;
import java.util.Scanner;

public class Exx20 {

	/*
	 * Leia dois número e o sinal do operador matemático. Faça o calculo baseado no
	 * operador recebido e imprima o resultado com uma frase dizendo se é: - par ou
	 * impar; valor % 2 == 0 - positivo ou negativo; valor > 0 - inteiro ou decimal;
	 * valor
	 */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double resultado = 0;
		String imparPar, PositivoNegativo, InteiroDecimal;
		boolean erro = false;

		System.out.println("Informe dois valores e operador matemático");
		System.out.print("Primeiro valor:");
		double valor1 = sc.nextDouble();
		System.out.print("Operador matemático:");
		char operador = sc.next().charAt(0);
		System.out.print("Segundo valor:");
		double valor2 = sc.nextDouble();
		System.out.println();

		switch (operador) {
		case '*':
			resultado = valor1 * valor2;
			break;
		case '/':
			resultado = valor1 / valor2;
			break;
		case '-':
			resultado = valor1 - valor2;
			break;
		case '+':
			resultado = valor1 + valor2;
			break;
		default:
			System.err.print("ERRO: ");
			System.out.printf("Operador '%c' inválido! Por favor, tente novamente.", operador);
			erro = true;
			break;
		}

		if (!erro) {
			if (resultado % 2 == 0) {
				imparPar = "par";
				InteiroDecimal = "inteiro";
			} else {
				imparPar = "impar";
				InteiroDecimal = "decimal";
			}
			if(resultado > 0) {
				PositivoNegativo = "positivo";
			}else {
				PositivoNegativo = "negativo";
			}
			System.out.printf("%.1f %c %.1f = %.1f", valor1, operador, valor2, resultado);
			System.out.printf(" (%s, %s e %s)", imparPar, PositivoNegativo, InteiroDecimal);
		}

		sc.close();
	}

}
