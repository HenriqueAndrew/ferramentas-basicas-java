package studyTool;

import java.util.Date;

//declaracao da classe Professor como extensao(subclasse) da classe Pessoa
public class Professor extends Pessoa{
	//declaracao de aluno invocando o construtor da superclasse "Pessoa" 
	public Professor(String _nome, String _cpf, Date _data) {
        super(_nome, _cpf, _data);
    }
	//variaveis (atributos) especificos da classe "Professor"
    public double salario;
    public String disciplina;
}
