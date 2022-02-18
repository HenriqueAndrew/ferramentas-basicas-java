package castingTool;

public class Casting {

	public static void main(String[] args) {
		
		int a, b, d;
		double c, resultado;
		
		a = 5;
		b = 2;
		c = 7.0;
		d = (int) c; //casting convertendo double para inteiro
		
		resultado = (double) a / b; //casting para converter inteiro para double
		
		System.out.println(resultado);			
		
		System.out.println(d);
		

	}

}
