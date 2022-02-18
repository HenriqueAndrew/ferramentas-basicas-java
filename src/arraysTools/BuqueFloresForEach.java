//Exemplo de itreracao Array para o programa buque flores, onde o mesmo devera imprimir as flores conforme execucao de loop for each (loop for simplificado)
package arraysTools;

public class BuqueFloresForEach {

	public static void main(String[] args) {
		//Definicao do "tipo de dados", "nome da variavel" e "tamanho do array" em unica linha
				String[] meuBuque = {"Rosa", "Girassol", "Eucalipto", "Dente de Leao", "Violeta", "Lirio"};
				//Utilizando esse metodo de declaracao de array nao eh necessario especificar o tamanho visto que o tamanho eh designado com ase no numero de elementos da lista entre {}
				for(String minhaFlor : meuBuque)//loop para inserir elementos da array na variavel indice
				{
					System.out.println(minhaFlor); //Imprimir resultado da variavel minhaFlor (valores inseridos na array/matriz) conforme execucao do loop
	            }

	}
}