package impressoesTool;

import java.util.Locale;

public class Impressoes {

	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("Products:\nComputer, which price is $ %.2f\nOffice desk, witch price is $ %.2f\n\n", price1, price2);
		System.out.printf("Record: %d years old, code %d and gender: %s\n\n", age, code, gender);
		System.out.printf("Measue with eight decimal places: %.8f\nRouded (three decimal places): %.3f\n", measure, measure);
		Locale.setDefault(Locale.US); //alterar padrão de casa decimal BR 'virgula' para padrão de casa decimal US 'ponto'
		System.out.printf("US decimal point: %.3f", measure);

	}

}
