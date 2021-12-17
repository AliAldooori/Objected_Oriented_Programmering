package Revition_OOP;

public class main {

	public static void main(String[] args) {
		
		
		
		Department d1 = new Department(1, "information system " ) ;
		
		
		
		 Salary_employe s1 = new Salary_employe("Ali", 5,"Stockholm", Gender.male, 500, 50, 150) ;
		d1.Add_Employee(s1);
		
		 Salary_employe s2 = new Salary_employe("Dalia", 4,"Stockholm", Gender.fmale, 450, 150, 250) ;
		d1.Add_Employee(s2);
		
		Hourly_Employe h1 = new Hourly_Employe("Saif", 3,"Uppsala", Gender.male, 50, 30) ;
		d1.Add_Employee(h1);
		
		Hourly_Employe h2 = new Hourly_Employe("Auas", 2,"Uppsala", Gender.male, 40, 25) ;
		d1.Add_Employee(h2);
		
		Commetion_employee c1 = new Commetion_employee("Anas ", 6,"Göteborg", Gender.male, 35, 4);
		d1.Add_Employee(c1);
		
		Commetion_employee c2 = new Commetion_employee("LeiA ", 1,"Hjärtat", Gender.fmale, 30, 5);
		d1.Add_Employee(c2);
		
		d1.print_alll_detailes();
		d1.print_base_data();
		
		System.out.println(d1.Get_Employee_no());
		System.out.println(s1.earning());
	s1.display_all_detailes();
		
	}

	
}
