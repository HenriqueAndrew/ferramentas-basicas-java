package studentTool; //declaracao do pacote
//import java.util.Scanner; //Importando classe de outros pacotes API.Java

public class Student //Declaracao da classe
{
	private int studentId;//declaracao de variavel
	private String name;// =
	private String ssn;// =
	private double gpa;// =
	public final int SCHODE = 34958; //declaracao de constante

			/*public Student(int studentId, String name, String ssn, double gpa) {//Construtor com  parametros
				this.studentId = studentId;
				this.name = name;
				this.ssn = ssn;
				this.gpa = gpa;
	}
	*/
	
	public Student() {//construtor padrao - sem parametros
		
	}

	public int getStudentId() {//um metodo de acesso, retorna o valor de cada variavel de classe
		return studentId;
	}
	public void setStudentId(int studentId) {// Um metodo de definicao, que altera o valor de cada variavel de classe
		this.studentId = studentId; 
	}
	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	
	public String getssn() {
		return ssn;
	}
	public void setssn(String ssn) {
		this.ssn = ssn;
	}
	
	public double getgpa() {
		return gpa;
	}
	public void setgpa(double gpa) {
		this.gpa = gpa;
	}
	
	public String toString()
	{
		String s1 = "";
		s1 = "Student Id: " + getStudentId() +
				" - Student Name: " + getname() +
				" - Student SSN: " + getssn() +
				" - Student GPA: " + getgpa();
		return s1;
	}
}
