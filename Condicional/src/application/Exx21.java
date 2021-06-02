package application;

import java.util.Locale;
import java.util.Scanner;

public class Exx21 {
	
	/*
	 * Crime: Receba 5 resposta de uma pessoa e imprima a classificação de sua participação no crime.
	 * Perguntas:
	 *	- "Telefonou para a vítima?"
	 *	- "Esteve no local do crime?"
	 *	- "Mora perto da vítima?"
	 *	- "Devia para a vítima?"
	 *	- "Já trabalhou com a vítima?" 
	 * Classificação:
	 * 	- 2 repostas positivas: "Suspeita";
	 *	- 3 ou 4 || ||:"Cúmplice";
	 *	- 5 || || : "Assassino";
	 *	- Nenhuma das anteriores: "Inocente".
	 */
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int resposta = 0;
		
		System.out.println("::::::INVESTIGAÇÃO CRIMINAL::::::");
		System.out.println("Houve um crime e uma pessoa foi assissinada. Você foi chamado(a) para depor.");
		System.out.println();
		System.out.print("Qual é o seu nome? ");
		String nome = sc.nextLine();
		System.out.println();
		System.out.println("A seguir, responda as perguntas somente com 's'(sim) ou 'n'(não): ");
		
		System.out.print("- Telefonou para a vítima? R.:");
		resposta += sc.next().charAt(0) == 's' ? 1 : 0;
		System.out.print("- Esteve no local do crime? R.:");
		resposta += sc.next().charAt(0) == 's' ? 1 : 0;
		System.out.print("- Mora perto da vítima? R.:");
		resposta += sc.next().charAt(0) == 's' ? 1 : 0;
		System.out.print("- Devia para a vítima? R.:");
		resposta += sc.next().charAt(0) == 's' ? 1 : 0;
		System.out.print("- Já trabalhou com a vítima? R.:");
		resposta += sc.next().charAt(0) == 's' ? 1 : 0;
		
		System.out.println();
		if(resposta == 5) System.out.printf("%s, você é o(a) assassino(a) do crime!", nome);
		else if(resposta >= 3) System.out.printf("%s, você é o(a) cumplice(a) do crime!", nome);
		else if(resposta == 2) System.out.printf("%s, você é suspeito(a) pelo crime!", nome);
		else System.out.printf("%s, você é inocente!", nome);
		
		sc.close();
	}
}