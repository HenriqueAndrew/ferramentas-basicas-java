//programa de teste sobre a instrucao de controle (loop): for com break
package LoopsTool;

import java.util.Scanner;

public class LoopForBreak {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int numInputs = 10, sum = 0, input = 0, stopLoop = 999;
		for(int i = 0; i < numInputs; i++) {
		System.out.println("Digite um numero: ");	
		input = in.nextInt();
		if(input==stopLoop) //se for digitado o numero 999 loop eh interrompido
			break;
		else
			sum +=input; //senao variavel sum recebe e soma o valor digitado
	}
	in.close();
	System.out.println ("A soma dos 10 numeros e igual a: " + sum);
   }
}
