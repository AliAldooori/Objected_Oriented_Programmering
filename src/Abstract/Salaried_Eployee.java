package Abstract;



public class Salaried_Eployee extends Eployeee {

	public Salaried_Eployee(String name, int age, double salary, String rank, String jobb, double bonus,
			double deduction) {
		super(name, age, salary, rank, jobb);
		Bonus = bonus;
		Deduction = deduction;
	}
	double Bonus ;
	double Deduction ;
	public double getBonus() {
		return Bonus;
	}
	public void setBonus(double bonus) {
		Bonus = bonus;
	}
	public double getDeduction() {
		return Deduction;
	}
	public void setDeduction(double deduction) {
		Deduction = deduction;
	}
	@Override
	public double totalsalary() {

		return this.salary + (this.Bonus - this.Deduction);
	}


	
}
