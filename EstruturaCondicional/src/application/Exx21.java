package application;

import java.util.Locale;
import java.util.Scanner;

public class Exx21 {
	
	/*
	 * Crime: Receba 5 resposta de uma pessoa e imprima a classifica��o de sua participa��o no crime.
	 * Perguntas:
	 *	- "Telefonou para a v�tima?"
	 *	- "Esteve no local do crime?"
	 *	- "Mora perto da v�tima?"
	 *	- "Devia para a v�tima?"
	 *	- "J� trabalhou com a v�tima?"�
	 * Classifica��o:
	 * 	- 2 repostas positivas: "Suspeita";
	 *	- 3 ou 4 || ||:"C�mplice";
	 *	- 5 || || : "Assassino";
	 *	- Nenhuma das anteriores: "Inocente".
	 */
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int resposta = 0;
		
		System.out.println("::::::INVESTIGA��O CRIMINAL::::::");
		System.out.println("Houve um crime e uma pessoa foi assissinada. Voc� foi chamado(a) para depor.");
		System.out.println();
		System.out.print("Qual � o seu nome? ");
		String nome = sc.nextLine();
		System.out.println();
		System.out.println("A seguir, responda as perguntas somente com 's'(sim) ou 'n'(n�o): ");
		
		System.out.print("- Telefonou para a v�tima? R.:");
		resposta += sc.next().charAt(0) == 's' ? 1 : 0;
		System.out.print("- Esteve no local do crime? R.:");
		resposta += sc.next().charAt(0) == 's' ? 1 : 0;
		System.out.print("- Mora perto da v�tima? R.:");
		resposta += sc.next().charAt(0) == 's' ? 1 : 0;
		System.out.print("- Devia para a v�tima? R.:");
		resposta += sc.next().charAt(0) == 's' ? 1 : 0;
		System.out.print("- J� trabalhou com a v�tima? R.:");
		resposta += sc.next().charAt(0) == 's' ? 1 : 0;
		
		System.out.println();
		if(resposta == 5) System.out.printf("%s, voc� � o(a) assassino(a) do crime!", nome);
		else if(resposta >= 3) System.out.printf("%s, voc� � o(a) cumplice(a) do crime!", nome);
		else if(resposta == 2) System.out.printf("%s, voc� � suspeito(a) pelo crime!", nome);
		else System.out.printf("%s, voc� � inocente!", nome);
		
		sc.close();
	}
}