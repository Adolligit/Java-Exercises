package application;

import java.util.Locale;
import java.util.Scanner;

public class Exx11 {
	
	/*
	 * Ler o sal�rio de um funcion�rio e calcular seu aumento.
	 * Exibir:
	 * - Antigo sal�rio;
	 * - Percentual de aumento;
	 * - Valor do aumento;
	 * - Novo sal�rio;
	 */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Double salario, novoSalario, porcAumento, valorAumento;
		
		System.out.println("++++++ AUMENTO DE SAL�RIO ESSE M�S ++++++");
		System.out.print("Informe seu sal�rio: R$");
		salario = sc.nextDouble();
		
		if(salario <= 280) {
			porcAumento = 0.2;
			valorAumento =  porcAumento * salario;
			novoSalario =  salario + valorAumento;
		}else if(salario > 280 && salario <= 700) {
			porcAumento = 0.15;
		valorAumento =  porcAumento * salario;
		novoSalario =  salario + valorAumento;
		}else if(salario > 700 && salario <= 1500) {
			porcAumento = 0.1;
		valorAumento =  porcAumento * salario;
		novoSalario =  salario + valorAumento;
		}else {
			porcAumento = 0.05;
			valorAumento =  porcAumento * salario;
			novoSalario =  salario + valorAumento;
		}
		
		System.out.println();
		System.out.println("====== O GERENTE FICOU LOUCO!!! =======");
		System.out.printf("Antigo sal�rio: R$%.2f.%n", salario);
		System.out.printf("Porcentagem de acrescimento: %%%.2f.%n", porcAumento);
		System.out.printf("Valor de acrescimento: R$%.2f.%n", valorAumento);
		System.out.printf("Novo sal�rio: R$%.2f.%n", novoSalario);
		
		sc.close();
	}

}
