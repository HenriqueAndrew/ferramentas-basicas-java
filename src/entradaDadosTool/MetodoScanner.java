package entradaDadosTool;

import java.util.Locale;
import java.util.Scanner;

public class MetodoScanner {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); //alterar padrão de casa decimal BR 'virgula' para padrão de casa decimal US 'ponto'
		Scanner sc = new Scanner(System.in);
		
		String x, s1;
		int y;
		double w;
		char z;
		
		System.out.println("Digite alguma coisa: ");
		x = sc.next(); //ler string
		System.out.println("Você digitou: " + x);
		
		System.out.println("\nDigite um número: ");
		y = sc.nextInt(); //ler números inteiros
		System.out.println("Você digitou o número: " + y);
				
		System.out.println("\nDigite um número decimal: ");		
		w = sc.nextDouble(); //ler números com ponto flutuante (decimais)
		System.out.printf("Você digitou o número: %.2f%n", w);
		
		System.out.println("\nDigite uma letra: ");		
		z = sc.next().charAt(0); //ler caractere
		System.out.println("Você digitou a letra: " + z);
		
		System.out.println("\nDigite uma frase: ");
		sc.nextLine(); //para consumir a linha pendente
		s1 = sc.nextLine();//para digitar uma frase (palavras separadas por espaço). Obs. 'next' apenas pega apenas a primeira palavra 
		System.out.println("A sua frase é: " + s1);
				
		sc.close();	

	}

}
