package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex3 {
	
	/*
	 * Ler a letra inicial do sexo e informar o nome completo.
	 * Informe sexo inválido para letras fora de F e M.
	 */
	
	public static void main(String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char sexo = sc.next().charAt(0);
		if(sexo == 'f' || sexo == 'F') System.out.println("Feminino");
		else if(sexo == 'm' || sexo == 'M') System.out.println("Masculino");
		else System.out.println("Sexo inválido");
		
		sc.close();
	}
}
