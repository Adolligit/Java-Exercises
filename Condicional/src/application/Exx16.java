package application;

import java.util.Locale;
import java.util.Scanner;

public class Exx16 {
	/*
	 * Calcular as raízes da equação do segundo grau.
	 * Receber três valores (a,b e c).
	 * Condição:
	 * - a == 0: não é equação de 2° grau.
	 * - (-delta): não possui raizes reais;
	 * - delta == 0: exibir valor da raiz real;
	 * - (+delta): exibir valores das duas raizes;
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, d, x1, x2;
		
		System.out.println("****** Função quadrática ******");
		System.out.println("Informe os valores correspondentes aos valores:");
		System.out.print("a:");
		a = sc.nextDouble();
		System.out.print("b:");
		b = sc.nextDouble();
		System.out.print("c:");
		c = sc.nextDouble();
		
		
		System.out.println();
		
		System.err.printf("f(x) = %.1fx² + %.1fx + %.1f%n", a,b,c);
		
		System.out.println();
		if(a == 0) {
			System.err.println("Este programa só calcula equação do 2° grau.");
			System.out.println();
			System.out.println("Com o valor de 'a' sendo zero, a equação fica: bx + c = 0");
			System.out.println("Ou seja, isso é uma equação do 1° grau.");
		}else {
			
			d = (b*b) -4 * a * c;
			x1 = (-1 * b + Math.sqrt(d)) / (2 * a);
			x2 = (-1 * b - Math.sqrt(d)) / (2 * a);
			
			if(d < 0) {
				System.out.println("Como delta é negativo, as raizes não possuem valores reais.");
			}else if(d == 0){
				System.out.println("Como delta é igual a zero, as raizes possuem o mesmo valor.");
				System.out.println();
				System.out.printf("X1 = %.2f, X2 = %.2f.", x1, x2);
			}else {
				System.out.println("Como delta é maior que zero, as raizes possuem valores distintos e positivos.");
				System.out.println();
				System.out.printf("X1 = %.2f, X2 = %.2f.", x1, x2);
			}
		}
		
		sc.close();
	}
}