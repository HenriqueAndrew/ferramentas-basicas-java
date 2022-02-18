package condicionaisTool;

import java.util.Scanner;

public class Planetas_Tester {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
				double peso = 0;
				System.out.println("Digite o seu peso na Terra: ");
				peso = in.nextDouble();
				int opcao = 0;
				System.out.println("Em qual planeta deseja saber o seu peso?: "
						+ "\n Digite 1 para Mercurio"
						+ "\n Digite 2 para Venus"
						+ "\n Digite 3 para Marte"
						+ "\n Digite 4 para Jupiter"
						+ "\n Digite 5 para Saturno"
						+ "\n Digite 6 para Urano"
						+ "\n Digite 7 para Netuno");
				opcao = in.nextInt();
				switch (opcao) {
				case 1:
					peso = peso * 0.38;
					System.out.println("Voce escolheu o planeta Mercurio");
					break;
				case 2:
					peso = peso * 0.91;
					System.out.println("Voce escolheu o planeta Venus");
					break;
				case 3:
					peso = peso * 0.38;
					System.out.println("Voce escolheu o planeta Marte");
					break;
				case 4:
					peso = peso * 2.36;
					System.out.println("Voce escolheu o planeta Jupiter");
					break;
				case 5:
					peso = peso * 0.92;
					System.out.println("Voce escolheu o planeta Saturno");
					break;
				case 6:
					peso = peso * 0.89;
					System.out.println("Voce escolheu o planeta Urano");
					break;
				case 7:
					peso = peso * 1.13;
					System.out.println("Voce escolheu o planeta Netuno");
					break;
				default:
					System.out.println("Opção invalida!");
				}
				in.close();
				System.out.println("\n O seu peso no planeta é: " + peso);
	}
}
