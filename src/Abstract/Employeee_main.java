package Abstract;

public class Employeee_main {

	public static void main(String[] args) {
		Salaried_Eployee s1 = new Salaried_Eployee("Leia", 40, 3500, "IT", "programering", 850, 150);
		
		System.out.println(s1.totalsalary());
	}

}
