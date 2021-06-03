package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {
	/*
	 *	Leia o nome o nome do usuário e uma senha. 
	 *	Emitr mensagem de erro caso a senha seja igual ao nome.
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Senha: ");
		String senha = sc.nextLine();
		
		
		while(senha.equals(nome)) {
			System.out.println();
			System.out.println("A senha não pode ser igual ao nome de usuário.");
			System.out.print("Informe outro senha: ");
			senha = sc.nextLine();
		}
		
		sc.close();
	}
}