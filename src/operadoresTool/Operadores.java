package operadoresTool;

import java.util.Locale;

public class Operadores {
	
	/* 
	 ***Lista de Operadores:
	 
	 --Operadores aritméticos
	 + soma
	 - subtracao
	 * multiplicacao
	 / divisao (resultado quociente)
	 % resto da divisao (mod - resultado resto)
	 
	 --Operadores lógicos
	 && AND logico
	 || OR logico
	 ! NÃO lógico
	 
	 --Operadores de atribuição
	 = atribuicao
	 += Concatenacao com atribuicao
	 
	 --Operadores relacionais
	 == igualdade
	 != não é igual a
	 > maior que
	 < menor que
	 >= maior que ou igual a
	 <= menor que ou igual a
	 
	 ?: Ternario (abreviacao de if-then-else)
	 
	 ***Metodos operacoes aritmeticas da classe Math:
	 Math.pow Exponeciacao
	 Math.round Arredondamento
	 Math.sqrt Raiz quadrada
	 Math.abs Valor absoluto
	 Math.con Cosseno
	 Math.sin Seno
	 */

	public static void main(String[] args) {
		double x = 3.0;
		double y = -4.0;
		double z = 7.0;
		int m = 23;
		int n = 9;
		double o, p, q, delta, x1, x2;		
		
		String nome = "Maria";
		int idade = 35;
		double renda = 4500.00;
		
		int a = 1;
		int b = 1;
		int c = 1;
		int d = 1;
		int e = 1;
		
		System.out.println(x + m * y - (y + n) * x);//
		System.out.println(m / n + m % n);
		System.out.println(5 * x - n / 5);
		System.out.println(Math.sqrt(Math.sqrt(n)));
		System.out.println((int)x);
		System.out.println(Math.round(y));
		
		System.out.println((int)Math.round(x) + (int)Math.round(y));
		System.out.println(m + n);
		System.out.println(1-1-((1-(1-(1-n)))));
		Locale.setDefault(Locale.US); //alterar padrão de casa decimal BR 'virgula' para padrão de casa decimal US 'ponto'
		System.out.printf("%.1f%n", x); // delimetador de casas decimais
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda); //Marcadores: (%s - texto) (%d - inteiro) (%f - ponto flutuante) (%n - quebra de linha)
		
				
		a += 10; //somou e atrbuiu valor de atribuicao com o valor da variavel declarada 
		b -= 10; //subtraiu e atribuiu valor de abribuicao com o valor da variavel declarada
		c *= 10; //multiplicou e atrbiuiu valor de atribuicao com o valor da variavel declarada
		d /= 10; //dividiu e atribuiu valor de atribuicao com o valor da variavel declarada, mostrando o resultado inteiro da divisao (quociente)
		e %= 10; //dividiu e atribuiu valor de atribuicao com o valor da variavel declarada, mostrando o resto da divisao
		
		System.out.println("a: "+ a + " b: "+ b + " c: " + c + " d: " + d + " e: " + e); //impressão de resultado de forma concatenada
		
		//raiz quadrada
		o = Math.sqrt(x);
		p = Math.sqrt(z);
		q = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de " + x + " = " + o);
		System.out.println("Raiz quadrada de " + z + " = " + p);
		System.out.println("Raiz quadrada de 25 = " + q);
		
		//exponeciação
		o = Math.pow(x, z);
		p = Math.pow(x, 2);
		q = Math.pow(5.0,  2.0);
		System.out.println(x + " elevado a " + z + " = " + o);
		System.out.println(x + " elevado a 2 = " + p);
		System.out.println("5 elevado a 2 = " + q);
		
		//valor absoluto
		o = Math.abs(y);
		p = Math.abs(z);
		System.out.println("Valor absoluto de " + y + " = " + o);
		System.out.println("Valor absoluto de " + z + " = " + p);
		
		//fórmula de bhaskara - equação de 2° grau
		delta = Math.pow(y, 2.0) - 4.0 * x * z; //Delta = b (ao quadrado) - 4ac
		x1 = (-y + Math.sqrt(delta)) / (2.0 * x); //x1 = -b + Raiz quadrada de delta / 2 * a
		x2 = (-y - Math.sqrt(delta)) / (2.0 * x); //x1 = -b - Raiz quadrada de delta / 2 * a
		
		System.out.println("O valor de x1 da equação de segundo grau é = " + x1);
		System.out.println("O valor de x2 da equação de segundo grau é = " + x2);
	}
}
