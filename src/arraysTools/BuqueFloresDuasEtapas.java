//buque de seis flores diferentes. Programa para armazenar cada tipo de flor no buque, usando duas etapas para declarar array

package arraysTools;

public class BuqueFloresDuasEtapas {

	public static void main(String[] args) {
		String[] meuBuque = new String[6]; //Definicao do "tipo de dados", "nome da variavel" e "tamanho do array" em unica linha
		meuBuque[0] = "Rosa"; //inicializando arrays atribuindo os elementos, informando o "nome da variavel", "indice" e o "valor"
		meuBuque[1] = "Girassol";
		meuBuque[2] = "Margarida";
		meuBuque[3] = "Dente de Leao";
		meuBuque[4] = "Violeta";
		meuBuque[5] = "Lirio";
		System.out.println("No meu buque existem as seguinte quantidade de flores: "+ meuBuque.length); //imprimir tamanho da array

	}

}
