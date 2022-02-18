//programa de teste sobre a instrucao de controle (loop): for com continue
package LoopsTool;

import java.util.Scanner;

public class LoopForContinue {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int numInputs = 10, input = 0;
		for(int i = 0; i < numInputs; i++) {
		System.out.println("Digite um numero: ");	
		input = in.nextInt();
		if(input % 2 == 0) //se for digitado o numero 999 loop eh interrompido
			continue;
	System.out.println ("Esse numero era impar");
    }
	in.close();
  }
}
