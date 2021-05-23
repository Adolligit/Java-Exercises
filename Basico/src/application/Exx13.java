package application;

import java.util.Scanner;

public class Exx13 {

	/*
	 * Ler o tamanho de um arquivo (em MB) e a velocidade da internet (em Mbps).
	 * Calcule e exiba em minutos o tempo aproximado de download deste arquivo
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double tamanhoArquivo = sc.nextDouble();
		double velocidadeInternet = sc.nextDouble();
		double velocidadeDownload = velocidadeInternet / 8;
		double tempoDownloadSegundo = tamanhoArquivo / velocidadeDownload;
		double tempoDownloadMinuto = tempoDownloadSegundo / 60;
		System.out.printf("%.2f minutos.",tempoDownloadMinuto);
		
		sc.close();
	}

}
