//programa de teste sobre a instrucao de controle (loop): for
package LoopsTool;

import java.util.Scanner;

public class LoopFor {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int numInputs = 10, sum = 0, input = 0;
		for(int i = 0; i < numInputs; i++) {
		System.out.println("Digite um numero: ");	
		input = in.nextInt();
		sum +=input;
	}
	in.close();
	System.out.println ("A soma dos 10 numeros e igual a: " + sum);
   }
}
