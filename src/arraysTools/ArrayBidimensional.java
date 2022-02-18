//**Array bidimensional - metodo 1** - pode ser visualizada como uma tabela com linhas e colunas
package arraysTools;

import java.util.Scanner;

public class ArrayBidimensional {//declarando classe

	public static void main(String[] args) {//declarando classe como main (driver)
		Scanner in = new Scanner (System.in);//Inicializando metodo scanner in
		int [][] nums = new int[3][2];//declarando array/matriz bidimencional
		
		for(int i = 0; i < nums.length; i++) {//loop para inserir valores(elementos) para linha da array bidimensional
			for(int j = 0; j < nums[i].length; j++) {//loop para inserir valores(elementos) para coluna da array bidimensional
				System.out.println("Dgite um valor para linha: " + i + ", coluna: " + j);//imprimir orientacao para digitar que o usuario digite valores para os elementos da linha e coluna
				nums[i][j] = in.nextInt();//atribuicao dos valores digitados pelo usuario nos indices de linha e coluna
			}
		}
		in.close();
	}
}
