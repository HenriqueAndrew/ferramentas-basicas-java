package condicionaisTool;

import java.util.Scanner;

public class Media_Tester {

	public static void main(String[] args) {
		double n1;
		double n2;
		double media;
		
		System.out.println("Media do Aluno para aprovação deverá ser ao menos 7,0 \n Digite a nota da primeira prova: ");
		Scanner in = new Scanner(System.in);
		n1 = in.nextDouble();
		System.out.println("Agora digite a nota da segunda prova: ");
		n2 = in.nextDouble();
		media = (n1 + n2)/2;
		in.close();
		if (media >= 7)
			System.out.println("Parabens, voce foi aprovado! \n A sua nota final foi de: " + media);
		else
			System.out.println("Uma pena, voce foi reprovado. \n A sua nota final foi de: " + media);

	}

}
