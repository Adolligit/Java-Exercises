package application;

import java.util.Locale;
import java.util.Scanner;

public class Exx16 {
	/*
	 * Calcular as ra�zes da equa��o do segundo grau.
	 * Receber tr�s valores (a,b e c).
	 * Condi��o:
	 * - a == 0: n�o � equa��o de 2� grau.
	 * - (-delta): n�o possui raizes reais;
	 * - delta == 0: exibir valor da raiz real;
	 * - (+delta): exibir valores das duas raizes;
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, d, x1, x2;
		
		System.out.println("****** Fun��o quadr�tica ******");
		System.out.println("Informe os valores correspondentes aos valores:");
		System.out.print("a:");
		a = sc.nextDouble();
		System.out.print("b:");
		b = sc.nextDouble();
		System.out.print("c:");
		c = sc.nextDouble();
		
		
		System.out.println();
		
		System.err.printf("f(x) = %.1fx� + %.1fx + %.1f%n", a,b,c);
		
		System.out.println();
		if(a == 0) {
			System.err.println("Este programa s� calcula equa��o do 2� grau.");
			System.out.println();
			System.out.println("Com o valor de 'a' sendo zero, a equa��o fica: bx + c = 0");
			System.out.println("Ou seja, isso � uma equa��o do 1� grau.");
		}else {
			
			d = (b*b) -4 * a * c;
			x1 = (-1 * b + Math.sqrt(d)) / (2 * a);
			x2 = (-1 * b - Math.sqrt(d)) / (2 * a);
			
			if(d < 0) {
				System.out.println("Como delta � negativo, as raizes n�o possuem valores reais.");
			}else if(d == 0){
				System.out.println("Como delta � igual a zero, as raizes possuem o mesmo valor.");
				System.out.println();
				System.out.printf("X1 = %.2f, X2 = %.2f.", x1, x2);
			}else {
				System.out.println("Como delta � maior que zero, as raizes possuem valores distintos e positivos.");
				System.out.println();
				System.out.printf("X1 = %.2f, X2 = %.2f.", x1, x2);
			}
		}
		
		sc.close();
	}
}