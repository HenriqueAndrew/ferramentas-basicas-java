//programa de teste sobre a instrucao de controle (loop): do-while (exercicio2)
package LoopsTool;

import java.util.Scanner;

public class LoopDoWhile2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int repeat = 0, sum = 0, input = 0;
		do{ 
			System.out.println("Entre com um numero: \n");
			input = in.nextInt();
			sum+= input;
			System.out.println("Voce quer digitar outro numero?: ");
			System.out.println("\n Digite 1 para SIM ou 2 para NAO: ");
			repeat = in.nextInt();
		} while (repeat == 1);
		in.close();
		System.out.println("A soma dos números é: " + sum);
	}

}
