package application;

import java.util.Locale;
import java.util.Scanner;

public class Exx20 {

	/*[EU SEI, COM POO FICA SIMPLES, MAS AQUI DEVEMOS RESOLVER SOMENTE COM LAÇO DE REPETIÇÃO]
	 * 
	 * Receba os seguintes dados: código, nome, altura e peso
	 * Finalizar a entrada de dados quando receber 0 no código.
	 * Imprimir:
	 * - Nome da pessoa mais alta, assim como da mais baixa, da mais gorda e da mais magra;
	 * - Média de altura e peso das pessoas.
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String nome, aAlta, aBaixa, aMagra, aGorda;
		int codigo, quantidadePessoas;
		double altura, peso, alta, baixa, gorda, magra, pesoTotal, alturaTotal;
		
		nome = aAlta = aBaixa = aMagra = aGorda = null;
		altura = peso = alta = baixa = gorda = magra = pesoTotal = alturaTotal = codigo = quantidadePessoas = 0;
		
		System.out.println("A seguir, entre com os dados das pessoas");
		
		do {
			System.out.println();
			System.out.print("Código: ");
			codigo = sc.nextInt();
			if(codigo == 0) break;
			sc.nextLine();
			System.out.print("Nome: ");
			nome = sc.nextLine();
			System.out.print("Altura: ");
			altura = sc.nextDouble();
			System.out.print("Peso: ");
			peso = sc.nextDouble();
			
			alturaTotal += altura;
			pesoTotal += peso;
			
			if(quantidadePessoas == 0) {
				aAlta = nome;
				aBaixa = nome;
				aGorda = nome;
				aMagra = nome;
				alta = baixa = altura; 
				magra = gorda = peso;
			}else {
				if(altura > alta) alta = altura; aAlta = nome;
				if(altura < baixa) baixa = altura; aBaixa = nome;
				if(peso > gorda) gorda = peso; aGorda = nome;
				if(peso < magra) magra = peso; aMagra = nome;
			}
			
			quantidadePessoas++;
		}while(codigo != 0);
		
		System.out.println();
		System.out.printf("Altura média: %.2f%n", alturaTotal / quantidadePessoas);
		System.out.printf("Peso médio: %.2f%n", pesoTotal / quantidadePessoas);
		System.out.println();
		System.out.println("Classificação");
		System.out.println("Mais alta:");
		System.out.printf("- Nome: %s%n", aAlta);
		System.out.printf("- Altura: %.2f%n", alta);
		System.out.println("Mais baixa:");
		System.out.printf("- Nome: %s%n", aBaixa);
		System.out.printf("- Altura: %.2f%n", baixa);
		System.out.println("Mais gorda:");
		System.out.printf("- Nome: %s%n", aGorda);
		System.out.printf("- Peso: %.2f%n", gorda);
		System.out.println("Mais magra:");
		System.out.printf("- Nome: %s%n", aMagra);
		System.out.printf("- Peso: %.2f%n", magra);
		
		sc.close();
	}

}
