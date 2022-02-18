package personTool;

public class Person {//declaracao de classe
	private String name;//declaracao de variaveis
	private int age;
	
	public Person(String name, int age) {//construtor com parametros
		this.name = name;
		this.age = age;
	}
	
	public String getname() {//metodo de acesso a varivel
		return name;
	}
	public int getage() {//metodo de acesso a variavel
		return age;
	}

	public String toString() {//metodo para conversao em string para impressao em tela
		String p1 = "";
		p1 = "Nome: " + getname() +
				" - Idade: " + getage();
		return p1;
	}

}
