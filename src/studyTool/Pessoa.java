package studyTool;

//Exemplo "this" (12.b):
//podemos perceber neste exemplo a aplicação do conceito de herança sobre as classes, onde a classe "Professor" e "Aluno" são subclasses da classe(superclasse) "Pessoa", e utilizamos a palavra-chave "super" para chamar o metodo construtor da superclasse "Pessoa" 

import java.util.Date;

//declaracao da superclasse Pessoa
public class Pessoa {
	//declaracao das variaveis da superclasse Pessoa
	 public String nome;
	    public String cpf;
	    public Date data_nascimento;
	    
	    //declaracao do construtor com parametros da superclasse Pessoa 
	    public Pessoa(String _nome, String _cpf, Date _data) {
	        this.nome = _nome;
	        this.cpf = _cpf;
	        this.data_nascimento = _data;
	    }
}

