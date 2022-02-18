package studentTool;

public class Student2 
{
	private String fName;
	private String lName;
	private int stuId;
	private String stuStatus;
	
	public Student2(){//construtor
	}
	//get e set variavel fName
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	//get e set variavel lName
	public String getlName() {
		return lName;	
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	//get e set variavel studId
	public int getstuId() {
		return stuId;
	}
	public void setstuId(int stuId) {
		this.stuId = stuId;
	}
	//get e set variavel stuStatus
	public String getstuStatus () {
		return stuStatus;
	}
	public void setstuStatus(String stuStatus) {
		this.stuStatus = stuStatus;
	}
	public String toString()
	{
		String s1 = "";
		s1 = "Nome do Aluno: " + getfName() +
				" " + getlName() +
				" - Matricula: " + getstuId() +
				" - Status: " + getstuStatus();
		return s1;
	}

}
