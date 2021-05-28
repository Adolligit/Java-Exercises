package application;

import java.util.Locale;
import java.util.Scanner;

public class Exx22 {
	/*
	 *	Leia a quantidade de litros e o tipo de combust�vel e imprima o calculo do pre�o.
	 *	�lcool:
	 * 	- at� 20 litros desconto de 3% e 5% acima;
	 * 	- pre�o litro: R$1,90.
	 * 	Galosina:
	 * 	- at� 20 litros desconto de 4% e 6% acima;
	 * 	- pre�o litro: R$2,50.
	 * 	NOTA: O tipo de combust�vel deve ser lido em char.
	 */
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Combust�veis na promo��o: �lcool e Gasolina");
		System.out.println();
		System.out.print("Digite a letra inicial do combust�vel: ");
		char combustivel = sc.next().charAt(0);
		System.out.print("Quantos litros? ");
		double litro = sc.nextDouble();
		double preco = 0;
		if(combustivel == '�' || combustivel == '�' || combustivel == 'a' || combustivel == 'A'){
			preco = litro * 1.9;
			preco -= litro <= 20 ? preco * 0.03 : preco * 0.05;
			System.out.printf("Pre�o: R$%.2f.", preco);
		}else if (combustivel == 'g' || combustivel == 'G') {
			preco = litro * 2.5;
			preco -= litro <= 20 ? preco * 0.04 : preco * 0.06;
			System.out.printf("Pre�o: R$%.2f.", preco);
		}else {
			System.out.printf("N�o h� combust�vel com a letra '%c' na promo��o.", combustivel);
		}
		sc.close();
	}
}