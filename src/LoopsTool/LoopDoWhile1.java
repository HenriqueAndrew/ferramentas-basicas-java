//programa de teste sobre a instrucao de controle (loop): do-while (exercicio1)
package LoopsTool;

import java.util.Scanner;

public class LoopDoWhile1 {

	public static void main(String[] args) {
		System.out.println("Digite 10 numeros para realizar a soma dos mesmos: \n");
		Scanner in = new Scanner(System.in);
		int numInputs = 0;
		int sum = 0, input = 0;
		do{ 
			System.out.println("Entre com um numero: \n");
			input = in.nextInt();
			sum+= input;
			numInputs++;
		} while (numInputs < 10);
		in.close();
		System.out.println("A soma dos dez números é: " + sum);
	}
}
