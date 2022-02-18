package studyTool;

import java.util.Date;

//declaracao da classe Aluno como extensao(subclasse) da classe Pessoa
public class Aluno extends Pessoa {
	//declaracao de aluno invocando o construtor da superclasse "Pessoa" 
	public Aluno(String _nome, String _cpf, Date _data) {
        super(_nome, _cpf, _data);
    }
    public String matricula;//variavel(atributo) especifico da classe "Aluno"
}



