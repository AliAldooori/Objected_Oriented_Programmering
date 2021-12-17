package inheritance;

public class Salaried_Employee  extends Employee{

	@Override
	public String toString() {
		return "Salaried_Employee [Bonus=" + Bonus + ", Deduction=" + Deduction + ", salary=" + salary + ", rank="
				+ rank + ", jobb=" + jobb + ", name=" + name + ", age=" + age + ", nationality=" + nationality
				+ ", adress=" + adress + "]";
	}
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
	
	public Salaried_Employee(String name, int age, String nationality, String adress, double salary, String rank,
			String jobb, double bonus, double deduction) {
		super(name, age, nationality, adress, salary, rank, jobb);
		Bonus = bonus;
		Deduction = deduction;
	}

	double Bonus ;
	double Deduction ;
	
}
