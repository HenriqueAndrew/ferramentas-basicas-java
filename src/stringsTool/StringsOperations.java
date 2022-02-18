package stringsTool;

/*  ***Sequencias de escapes para String:

/" - Aspas duplas
\' - Aspas simples
\\ - Barra invertida
\t - Tabulacao horizontal
\n - Alimentacao de linha
\b - Backspace
\r - Retorno de carro
\f - Avanco de pagina 

***Alguns métodos uteis

.length() --retorna o comprimento ou o numero de caracteres na string
.equals(Object anObject) --comparar valores de string retornando true se igual ou false se diferente
.compareTo(String anotherString) --comparar valores de string retornando inteiros negativos, 0 ou inteiros positivos como resposta
.substring(x, y) --pega pata dos caracteres da string para imprimir em tela conforme parametros definidos
.toLowerCase() --torna os caracteres da string todas em minusculas
.toUpperCase() --torna os caracteres da string todas em maiusculas
.charAt(int index) --retorna o caracter da string localizada no no indice especificado como parametro
.indexOf(char x) --retorna o valor de indice da primeira ocorrencia de x da String

*/

public class StringsOperations {
	
	public static void main(String[] arg){
		
		String string1 = "Hello";
		String string2 = "Lisa";
		String string3 = ""; //Declarando string com valor null
		string3 = "How arew you ".concat(string2); //concatenando valor de string3 com string2
		System.out.println("string3: " + string3); //imprimindo resutlado de string3		
		System.out.println("Lengh: "+ string1.length()); //obter comprimento ou o numero de caracteres da variavel
		System.out.println("Sub: "+ string3.substring(0, 5)); //obter substring comencando com caracter 0, subindo ate o quinto caracter
		System.out.println("Upper: "+string3.toUpperCase()); //Converter descricao para maiuscula

		//Nao existe diferenca entre as Strings a seguir. Ambos os metodos de instanciacao criam objetos identicos
		String s1 = new String("abc");//String instanciada por novo operador
		String s2 = "abc";//String instanciada por literais de String
		
		//Concatene duas strings com os operadores: '+' e '+='
		// + é usado para concatenar duas strings
		// += é usado para concatenar duas strings e atribui-las a si mesmas, tudo em uma operacao
		String s3 = "Essa é a ";
		String s4 = "string";
		String s5 = s3 + s4;
		String s6 = "Essa é a "+ s4;
		//String s3 += s4;
		
		
		//Exemplos de metodos compareTo e equals
		String s7 = "abc";
		String s8 = "cde";
		System.out.println(s7.compareTo(s8));
		System.out.println(s7.contentEquals(s8));
	}

}
