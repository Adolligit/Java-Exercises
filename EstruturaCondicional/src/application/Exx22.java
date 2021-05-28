package application;

import java.util.Locale;
import java.util.Scanner;

public class Exx22 {
	/*
	 *	Leia a quantidade de litros e o tipo de combustível e imprima o calculo do preço.
	 *	Álcool:
	 * 	- até 20 litros desconto de 3% e 5% acima;
	 * 	- preço litro: R$1,90.
	 * 	Galosina:
	 * 	- até 20 litros desconto de 4% e 6% acima;
	 * 	- preço litro: R$2,50.
	 * 	NOTA: O tipo de combustível deve ser lido em char.
	 */
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Combustíveis na promoção: Álcool e Gasolina");
		System.out.println();
		System.out.print("Digite a letra inicial do combustível: ");
		char combustivel = sc.next().charAt(0);
		System.out.print("Quantos litros? ");
		double litro = sc.nextDouble();
		double preco = 0;
		if(combustivel == 'á' || combustivel == 'Á' || combustivel == 'a' || combustivel == 'A'){
			preco = litro * 1.9;
			preco -= litro <= 20 ? preco * 0.03 : preco * 0.05;
			System.out.printf("Preço: R$%.2f.", preco);
		}else if (combustivel == 'g' || combustivel == 'G') {
			preco = litro * 2.5;
			preco -= litro <= 20 ? preco * 0.04 : preco * 0.06;
			System.out.printf("Preço: R$%.2f.", preco);
		}else {
			System.out.printf("Não há combustível com a letra '%c' na promoção.", combustivel);
		}
		sc.close();
	}
}