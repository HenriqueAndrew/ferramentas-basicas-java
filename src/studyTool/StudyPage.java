package studyTool;

import java.util.Scanner;

public class StudyPage {

	public static void main(String[] args) {
		
		Scanner scanterm = new Scanner(System.in); //scanear entrada de dados pelo usuario/teclado
		String termvar; //criar variavel string
		System.out.println("Enter a study term"); //imprimir orientacao ao usuario sobre a entrada de dados 
		termvar = scanterm.nextLine(); //variavel receber dado informado na entrada do usuario		
		Scanner scandef = new Scanner(System.in); //scanear nova entrada de dados pelo usuario/teclado
		String termdef; //criar nova variavel string
		System.out.println("Enter a definition"); //imprimir orientacao ao usuario sobre a entrada de dados
		termdef = scandef.nextLine(); //variavel receber dado informado na entrada do usuario
		scandef.close(); //encerrar entrada de dados 2
		System.out.println(termvar + ": " + termdef); //apresentar resultado, entrada 1 + entrada 2
		scanterm.close(); //encerrar entrada de dados 1
	}
}





