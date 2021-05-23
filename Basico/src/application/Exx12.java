package application;

import java.util.Scanner;

public class Exx12 {

	/*
	 * Ler o valor da hora e quantidade de horas trabalhadas no m�s.
	 * Calcular o desconto. IR:11%; INSS:8%; Sindicato:5%.
	 * Imprir as seguintes informa��es:
	 *  - Sal�rio bruto;
	 *  - IR;
	 *  - INSS;
	 *  - Sindicato;
	 *  - Sal�rio l�quido.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double precoHora, salarioBruto, salarioLiquido, ir, inss, sindicato;
		int hora;
		
		System.out.print("Pre�o por hora trabalhada: R$");
		precoHora = sc.nextDouble();
		
		System.out.print("Horas trabalhadas no m�s: ");
		hora = sc.nextInt();
		
		salarioBruto = precoHora * hora;
		ir = salarioBruto * 0.11;
		inss = salarioBruto * 0.08;
		sindicato = salarioBruto * 0.05;
		salarioLiquido = salarioBruto - (ir + inss + sindicato);
		
		System.out.println();
		System.out.printf("Sal�rio bruto: R$%.2f.%n", salarioBruto);
		System.out.printf("IR(11%%): R$%.2f.%n", ir);
		System.out.printf("INSS(8%%): R$%.2f.%n", inss);
		System.out.printf("Sindicado(5%%): R$%.2f.%n", sindicato);
		System.out.printf("Sal�rio liquido: R$%.2f.%n", salarioLiquido);
		sc.close();
	}

}
