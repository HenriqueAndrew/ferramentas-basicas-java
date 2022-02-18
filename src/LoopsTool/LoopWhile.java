//programa de teste sobre a instrucao de controle (loop): while
package LoopsTool;

import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		System.out.println("Digite 10 numeros para realizar a soma dos mesmos: \n");
		Scanner in = new Scanner(System.in);
		int numInputs = 0;
		int sum = 0;
		while(numInputs < 10) {
			int input = in.nextInt();
			sum+= input;
			numInputs++;
		}
		in.close();
		System.out.println("A soma dos dez números é: " + sum);
	}
}

