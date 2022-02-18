//programa de teste sobre a instrucao de controle (loop): while usando string
package LoopsTool;

import java.util.Scanner;

public class LoopWhileString { //programa para identificar se a palavra digitada eh um palindromo

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite uma palavra: ");
		String word = in.next();
		int firstPosition = 0;
		int lastPosition = word.length() - 1;
		boolean isAPalindrome = true;
		while(firstPosition < lastPosition) {
			if(word.charAt(firstPosition)!=word.charAt(lastPosition))
				isAPalindrome = false;
			firstPosition++;
			lastPosition--;
		}
		if(isAPalindrome)
			System.out.println("A palavra é um Palindrome");
		else
			System.out.println("A palavra não é um Palindrome");
		in.close();
	}	
}
