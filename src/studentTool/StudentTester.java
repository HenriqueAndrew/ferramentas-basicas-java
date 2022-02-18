package studentTool;

public class StudentTester {

	public static void main(String[] args) {
		//Student s1 = new Student(123, "Mary Smith", "999-99-9999", 3.4);
		Student s2 = new Student(); //construtor
		s2.setStudentId(124);
		s2.setname("John Jacoby");
		s2.setssn("123-45-6789");
		s2.setgpa(4.0);
		System.out.println(s2);
		Student s3 = new Student(); //construtor
		System.out.println(s3);
	}
}
