package personTool;

public class PersonTester {

	public static void main(String[] args) {
		Person p1 = new Person("Arial", 37);
		Person p2 = new Person("Joseph", 15);
		
		if(p1.getage()==p2.getage()) {
			System.out.println(p1.getname()+ " Tem a mesma idade que "+p2.getname());
		}
		else {
			System.out.println(p1.getname()+ " nao tem a mesma idade que "+p2.getname());
		}
			//System.out.println(p1);

	}

}
