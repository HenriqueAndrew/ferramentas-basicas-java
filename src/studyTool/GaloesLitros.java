package studyTool;

import java.util.Scanner;

public class GaloesLitros {

	public static void main(String[] args) {
		// Programa para converter galoes em litros
		Scanner sc = new Scanner(System.in);
		double galoes;
		System.out.println("Digite a quantidade de galoes que deseja converter: ");
		galoes = sc.nextDouble();
		double litros = (galoes * 3.785);
		System.out.println("A quantidade de galoes informada representa a quantidade de: " + litros + " litros");
		sc.close();
	}
}
