package application;
import java.util.Locale;
import java.util.Scanner;

public class Exx10 {

	/*
	 * Ler o turno do usuário por meio de uma letra.
	 * - M - matutino;
	 * - V - vespertino;
	 * - N - noturno;
	 * Exibir uma mensagem de saudação:
	 * - Bom dia;
	 * - Boa tarde;
	 * - Boa noite;
	 */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char turno  = sc.nextLine().charAt(0);
		if(turno == 'm' || turno == 'M') System.out.println("Bom dia!");
		else if(turno == 'v' || turno == 'V') System.out.println("Bom tarde!");
		else if(turno == 'n' || turno == 'N') System.out.println("Bom noite!");
		else System.out.println("Valor inválido!");

		sc.close();
	}
}
