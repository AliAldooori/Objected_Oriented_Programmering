package Revition_OOP;



public class Salary_employe  extends Employe implements Dissplayable {

	public Salary_employe() {
		super();
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getBonus() {
		return Bonus;
	}
	public void setBonus(double bonus) {
		Bonus = bonus;
	}
	public double getDedction() {
		return Dedction;
	}
	public void setDedction(double dedction) {
		Dedction = dedction;
	}
	@Override
	public String toString() {
		return "Salary_employe [salary=" + salary + ", Bonus=" + Bonus + ", Dedction=" + Dedction + ", name=" + name
				+ ", ssn=" + ssn + ", adress=" + adress + "]";
	}

	

	public Salary_employe(String name, int ssn, String adress, Gender gnd, double salary, double bonus,
			double dedction) {
		super(name, ssn, adress, gnd);
		this.salary = salary;
		Bonus = bonus;
		Dedction = dedction;
	}



	double salary ;
	double Bonus ;
	double Dedction ;
	@Override
	public double earning() {
		
		return (this.salary + this.Bonus) - this.Dedction;
	}
	@Override
	public void display_all_detailes() {
		System.out.println(super.toString());
		System.out.println(toString());
	}
	@Override
	public void display_earnings() {
		System.out.println(earning());
	}
	
}
