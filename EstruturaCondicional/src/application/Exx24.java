package application;

import java.util.Locale;
import java.util.Scanner;

public class Exx24 {
	/*
	 *	Leia o tipo de carne e a quantidade em kilograma e imprima: 
	 *	- tipo de carne; 
	 *	- quantidade de carne (kg);
	 *	- subtotal do valor da carne;
	 *	- tipo de pagamento;
	 *	- valor do desconto;
	 *	- valor total a pagar. 
	 *	Deve ser aceito somente um tipo de carne e quando o pagamento for pelo cartão "Tabajara", 
	 *	dar desconto no valor total será de 5%. Tipos de carne:
	 *	- File duplo: até 5kg, R$4,90 (kg); acima R$5,80 (kg).
	 *	- Alcatra: até 5kg, R$5,90 (kg); acima R$6,80 (kg).
	 *	- Picanha: até 5kg, R$6,90 (kg); acima R$7,80 (kg).
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double subtotal = 0, desconto = 0, total = 0;
		boolean erro = false;
		
		
		System.out.println("::: CARNES :::");
		System.out.println("1) File duplo");
		System.out.println("2) Alcatra");
		System.out.println("3) Picanha");
		System.out.println("::::::::::::::");
		
		System.out.print("Selecione uma das carnes pelo número correspondente: ");
		int carne = sc.nextInt();
		System.out.print("KG: ");
		double kiloGrama = sc.nextDouble();
		System.out.println();
		
		switch(carne) {
		case 1:
			/*File duplo*/
			subtotal = kiloGrama > 5 ? kiloGrama * 5.8 : kiloGrama * 4.9;
			break;
		case 2:
			/*Alcantra*/
			subtotal = kiloGrama > 5 ? kiloGrama * 6.8 : kiloGrama * 5.9;
			break;
		case 3:
			/*Picanha*/
			subtotal = kiloGrama > 5 ? kiloGrama * 7.8 : kiloGrama * 6.9;
			break;
		default:
			System.err.printf("%d é um código inválido.%n", carne);
			erro = true;
			break;
		}
		
		if(!erro) {
			System.out.println(":::: PAGAMENTO ::::");
			System.out.println("1) Dinheiro");
			System.out.println("2) Cartão");
			System.out.println("3) Cartão Tabajara");
			System.out.println(":::::::::::::::::::");
			System.out.print("Selecione uma das formas de pagamento pelo número correspondente: ");
			int pagamento = sc.nextInt();
			System.out.println();
			
			desconto = pagamento == 3 ? subtotal * 0.05 : 0; //desconto
			total = subtotal - desconto;
			
			System.out.println("::::::::::: CUPOM FISCAL :::::::::::");
			System.out.printf("Carne selecionada: %s%n", carne);
			System.out.printf("Quantidade de carne (KG): %.2f%n", kiloGrama);
			System.out.printf("Subtotal: R$%.2f%n", subtotal);
			System.out.printf("Tipo de pagamento: %d%n", pagamento);
			System.out.printf("Valor do desconto: R$%.2f%n", desconto);
			System.out.printf("Preço total: R$%.2f%n", total);
			System.out.println("::::::::::::::::::::::::::::::::::::");
		}
		
		
		sc.close();
	}
}