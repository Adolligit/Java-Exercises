package application;

import java.util.Locale;
import java.util.Scanner;

public class Exx23 {
	/*
	 *	Leia a quantidade de kilograma de cada fruta e imprima o total preço a ser pago. 
	 *	8 kilograma de frutas ou valor total acima R$25,00, descontar 10% no valor total. 
	 *	A tabela de preço é a seguinte:
	 *	- Morango: até 5kg, R$2,50 (kg); acima R$2,20 (kg).
	 *	- Maçã: até 5kg, R$1,80 (kg); acima R$1,50 (kg).
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Frutas em promoção!");
		System.out.println();
		System.out.println("Abaixo informe o Kg da fruta");
		System.out.print("Morango: ");
		double morangoKg = sc.nextDouble();
		System.out.print("Maçã: ");
		double macaKg = sc.nextDouble();
		double kgTotal = morangoKg + macaKg;
		double preco = 0;
		
		preco += morangoKg > 5 ? morangoKg * 2.2 : morangoKg * 2.5;
		preco += macaKg > 5 ? macaKg *1.5 : macaKg * 1.8;
		
		if(kgTotal > 8 || preco > 25) {
			preco -= preco * 0.1; 
		}
		
		System.out.println();
		System.out.printf("%.2f(Kg) de fruta: R$%.2f.",kgTotal, preco);
		
		sc.close();
	}
}