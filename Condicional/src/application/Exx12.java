package application;

import java.util.Locale;
import java.util.Scanner;

public class Exx12 {

	/*
	 * Calcule o salário de um funcionário, assim como os descontos.
	 * 
	 * Leia: 
	 * - quantidade de hora trabalha no mês;
	 * - valor da hora;
	 * 
	 * Imprima: 
	 * - salário bruto; 
	 * - sindicado (-3%);
	 * - ir (-5%);
	 * - inss (-10%);
	 * - fgts(11%); [não é desconto]
	 * - valor total de descontos;
	 * - salário líquido.
	 * 
	 * Valor de desconto do IR:
	 * - até R$900.00: insento;
	 * - até R$1500.00: 5%;
	 * - até R$2500.00: 10%;
	 * - acima de R$2500.00: 20%;
	 * 
	 */
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int hora;
		double valorHora, salarioBruto, salarioLiquido, descontoTotal, sindicato, ir, porcentagemIR, inss, fgts;
		
		System.out.print("Valor da sua hora: R$");
		valorHora = sc.nextDouble();
		System.out.print("Horas trabalhadas no mês: ");
		hora = sc.nextInt();
		
		salarioBruto = hora * valorHora;
		sindicato = salarioBruto * 0.03;
		inss = salarioBruto * 0.10;
		fgts = salarioBruto * 0.11;
		
		if(salarioBruto > 900 && salarioBruto <= 1500) {
			porcentagemIR = 0.05;
			ir = porcentagemIR * salarioBruto;
		}else if(salarioBruto > 1500 && salarioBruto <= 2500) {
			porcentagemIR = 0.10;
			ir = porcentagemIR * salarioBruto;
		}else if(salarioBruto > 2500) {
			porcentagemIR = 0.20;
			ir = porcentagemIR * salarioBruto;
		}else {
			porcentagemIR = 0;
			ir = 0.0;
		}
		
		
		descontoTotal = sindicato + ir + inss;
		salarioLiquido = salarioBruto;
		salarioLiquido -= descontoTotal;
		
		System.out.println();
		System.out.printf("Salário: R$%.2f.%n", salarioBruto);
		System.out.println("====Descontos====");
		System.out.printf("Sindicato (%%3): R$%.2f.%n", sindicato);
		System.out.printf("IR (%%%.0f): R$%.2f.%n", (porcentagemIR * 100), ir);
		System.out.printf("INSS (%%10): R$%.2f.%n", inss);
		System.out.printf("Total (%%%.0f): R$%.2f.%n", (3 + (porcentagemIR * 100) + 10),descontoTotal);
		System.out.println("=================");
		System.out.printf("FGTS (%%11): R$%.2f.%n", fgts);
		System.out.printf("Salário líquido: R$%.2f.", salarioLiquido);
		sc.close();
	}

}
