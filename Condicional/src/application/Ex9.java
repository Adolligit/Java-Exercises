package application;
import java.util.Locale;
import java.util.Scanner;

public class Ex9 {

	/*
	 * Ler três valores e imprir em ordem decresente
	 */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();

		
		if (x > y && x > z)
			if (y > z)
				System.out.printf("%d, %d, %d. ", x, y, z);
			else
				System.out.printf("%d, %d, %d. ", x, z, y);
		else if (y > x && y > z)
			if (x > z)
				System.out.printf("%d, %d, %d. ", y, x, z);
			else
				System.out.printf("%d, %d, %d. ", y, z, x);
		else
			if (x > y)
				System.out.printf("%d, %d, %d. ", z, x, y);
			else
				System.out.printf("%d, %d, %d. ", z, y, x);
		sc.close();
	}
}
