//programa de teste sobre a instrucao de controle (loop): do-while (exercicio3)
package LoopsTool;

import java.util.Scanner;

public class LoopDoWhile3 {//programa para realizar as operacoes matematicas entre dois numeros ja definidos, dando a possiblidade do usuario sair do sistema no final da execucao do programa

	public static void main(String[] args) {
		boolean quit = false;
		int num1 = 10, num2 = 6, answer = 0;
		char operand = ' ';
		Scanner in = new Scanner(System.in);
		do {
			System.out.println("Digite uma das operacoes matematicas que deseja realizar: \n");
			System.out.println("'+' para soma\n'-' para subtracao\n'*' para multiplicacao\n'/' para divisao");
			String input = in.next();
			operand = input.charAt(0);
			switch (operand) {
			case '*':
				answer = num1 * num2;
				System.out.println("O resultado da operacao eh igual a: " + answer);
				break;
			case '+':
				answer = num1 + num2;
				System.out.println("O resultado da operacao eh igual a: " + answer);
				break;
			case '-':
				answer = num1 - num2;
				System.out.println("O resultado da operacao eh igual a: " + answer);
				break;
			case '/':
				answer = num1 / num2;
				System.out.println("O resultado da operacao eh igual a: " + answer);
				break;
			default:
				System.out.println("Operacao invalida!");
			}	
		System.out.println("Quit? Y/N");
		if(in.next().equalsIgnoreCase("Y"))
			quit = true;
		}
		while(!quit);
		in.close();
	}

}
