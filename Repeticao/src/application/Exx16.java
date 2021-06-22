package application;

import java.util.Scanner;

public class Exx16 {

	/*
	 * Eleição: há três candidatos para votar. Leia o número de eleitores, 
	 * leia seus votos e imprima a quantidade de voto de cada candidato.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numeroCandidato, eleitores, bol, lul, ser;
		numeroCandidato = eleitores = bol = lul = ser = 0;
		
		System.out.println(":::::: ELEIÇÕES PRESIDENCIAIS ::::::");
		System.out.println("1) Bolsonaro");
		System.out.println("2) Lula");
		System.out.println("3) Sérgio Moro");
		System.out.println("::::::::::::::::::::::::::::::::::::");
		System.out.println();
		
		System.out.print("Quantos eleitores irão votar? ");
		eleitores = sc.nextInt();
		System.out.println();
		for(int i = 0; i < eleitores; i++) {
			System.out.printf("%d°(ª) eleitor(a). Digite o número do candidato:", i+1);
			numeroCandidato = sc.nextInt();
			switch(numeroCandidato) {
			case 1:
				bol++;
				break;
			case 2:
				lul++;
				break;
			case 3:
				ser++;
				break;
			default:
				System.err.println("Número inválido. Por favor, tente novamente.");
				break;
			}
		}
		
		System.out.println();
		System.out.println(":::::: RESULTADO ::::::");
		System.out.printf("Bolsonaro: %d voto(s).%n", bol);
		System.out.printf("Lula: %d voto(s).%n", lul);
		System.out.printf("Sérgio Moro: %d voto(s).%n", ser);
		System.out.println(":::::::::::::::::::::::");
		
		
		
		sc.close();
	}
}