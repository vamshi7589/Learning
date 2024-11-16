package Programs;

public class FirstProgram {
	
	 String EmployeeName = "Vamshi Krishna";
	 int EmpID = 123;
	

	public static void main(String[] args) {
		
		System.out.println("Hello world!");
		System.out.println(new FirstProgram().EmployeeName); // creating direct object
		FirstProgram p = new FirstProgram(); // creating object with reference
		System.out.println(p.EmpID);
		
		

	}

}
