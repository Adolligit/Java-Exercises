package application;

import java.util.Scanner;

public class Exx12 {

	/*
	 * Ler o valor da hora e quantidade de horas trabalhadas no mês.
	 * Calcular o desconto. IR:11%; INSS:8%; Sindicato:5%.
	 * Imprir as seguintes informações:
	 *  - Salário bruto;
	 *  - IR;
	 *  - INSS;
	 *  - Sindicato;
	 *  - Salário líquido.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double precoHora, salarioBruto, salarioLiquido, ir, inss, sindicato;
		int hora;
		
		System.out.print("Preço por hora trabalhada: R$");
		precoHora = sc.nextDouble();
		
		System.out.print("Horas trabalhadas no mês: ");
		hora = sc.nextInt();
		
		salarioBruto = precoHora * hora;
		ir = salarioBruto * 0.11;
		inss = salarioBruto * 0.08;
		sindicato = salarioBruto * 0.05;
		salarioLiquido = salarioBruto - (ir + inss + sindicato);
		
		System.out.println();
		System.out.printf("Salário bruto: R$%.2f.%n", salarioBruto);
		System.out.printf("IR(11%%): R$%.2f.%n", ir);
		System.out.printf("INSS(8%%): R$%.2f.%n", inss);
		System.out.printf("Sindicado(5%%): R$%.2f.%n", sindicato);
		System.out.printf("Salário liquido: R$%.2f.%n", salarioLiquido);
		sc.close();
	}

}
