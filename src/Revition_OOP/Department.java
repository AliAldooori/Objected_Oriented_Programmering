package Revition_OOP;

import java.util.ArrayList;

public class Department {
	
	int dno ;
	String dname ;
	
	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public ArrayList<Employe> getEmplist() {
		return emplist;
	}

	public void setEmplist(ArrayList<Employe> emplist) {
		this.emplist = emplist;
	}

	ArrayList<Employe> emplist ;
	
	public Department() {
		super();
	}

	public Department(int dno, String dname) {
		super();
		this.dno = dno;
		this.dname = dname;
		emplist = new ArrayList <Employe> ();
	}
	public void Add_Employee (Employe e) {
		
		emplist.add(e) ;
	}
	public void Remove_Employee ( int idx) {
		
		emplist.remove(idx) ;
		
		
	}
	public int Get_Employee_no () {
		return emplist.size();
		
		
	}
public void print_base_data () {
	
	
	for (int i = 0; i < emplist.size(); i++) {
		
		System.out.println(emplist.get(i).getSsn()+ "  " + emplist.get(i).getName() + " " + emplist.get(i).getGnd() );
	}
	
	}public void print_alll_detailes () {
		for (int i = 0; i < emplist.size(); i++) {
			
			if ( emplist.get(i) instanceof Hourly_Employe)
	    ( (Hourly_Employe )emplist.get(i)).display_all_detailes();
			
			if  ( emplist.get(i) instanceof Salary_employe)
				((Salary_employe) emplist.get(i)).display_all_detailes();
			if (emplist.get(i) instanceof Commetion_employee)
				((Commetion_employee) emplist.get(i)).display_all_detailes();
			
		}
	
}
}
