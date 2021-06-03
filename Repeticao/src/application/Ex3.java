package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex3 {
	/*
	 *	Leia e valide: 
	 *	- nome (caracteres > 3); 
	 *	- idade (entre 0 e 150); 
	 *	- salário (> 0);
	 *	- sexo (f ou m); e 
	 *	- estado civil (solteiro, casado, viúvo(a) ou divorciado(a)).
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int idade;
		double salario;
		char sexo, estadoCivil;
		boolean repeteCadastro;
		
		do {
			repeteCadastro = false;
			System.out.print("Nome: ");
			nome = sc.nextLine();
			repeteCadastro = nome.length() < 3 ? true : false;
			System.out.print("Idade: ");
			idade = sc.nextInt();
			repeteCadastro = idade < 0  && idade > 150? true : false;
			System.out.print("Salário: $");
			salario = sc.nextDouble();
			repeteCadastro = salario < 0 ? true : false;
			System.out.print("Sexo (f/m): ");
			sexo = sc.next().charAt(0);
			repeteCadastro = (sexo != 'f' &&  sexo != 'm') ? true : false;
			sc.nextLine();
			System.out.print("Estado civil (s/c/v/d): ");
			estadoCivil = sc.next().charAt(0);
			sc.nextLine();
			if(estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd') {
				repeteCadastro = true;
			}
			if(repeteCadastro) {
				System.out.println();
				System.out.println("Alguns dos dados foram inseridos incorretamente. Por favor, tente novamente!");
			}
			System.out.println();
		}while(repeteCadastro);
		
		System.out.printf("%s, %d, $%.2f, %c, %c.%n", nome, idade, salario, sexo, estadoCivil);
		
		sc.close();
	}
}