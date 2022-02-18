//**Array bidimensional utilizado para programa do buque de flores
/*Para saber o tamanho das Arrays Externas e Internas:
Externa: arrayName.length; //para saber a quantidade de linhas
Interna: arrayName[informa indice da linha].length; //para saber a quantidade de colunas
*/
package arraysTools;

public class BuqueFloresBidimensional {

	public static void main(String[] args) {
		String[][] meuBuque = new String[][] {{"Vermelha", "Pessego", "Amarela"},
			                              {"Amarela", "Branca", "Azul"},
			                              {"Verde", "Azul", "Roxa"},
			                              {"Branca", "Branca", "Branca"},
			                              {"Roxa", "Rosa", "Violeta"},
			                              {"Rosa", "Laranja", "Branca"}};
		String rose1 = meuBuque[0][0]; //acessara o primeiro elemento(coluna) da primeira array/indice (linha)	                              
			System.out.println("Qual eh a cor da minha flor rosa: "+ rose1);
			System.out.println("Rosa " + meuBuque[0][1]);
			System.out.println("Lirio "+ meuBuque[5][2]);
		}

	}
