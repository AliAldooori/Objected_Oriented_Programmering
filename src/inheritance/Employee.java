package inheritance;

public class Employee extends Person  {
   @Override
	public String toString() {
		return "Employee [salary=" + salary + ", rank=" + rank + ", jobb=" + jobb + ", name=" + name + ", age=" + age
				+ ", nationality=" + nationality + ", adress=" + adress + "]";
	}
public Employee(String name, int age, String nationality, String adress, double salary, String rank, String jobb) {
		super(name, age, nationality, adress);
		this.salary = salary;
		this.rank = rank;
		this.jobb = jobb;
	}
public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getJobb() {
		return jobb;
	}
	public void setJobb(String jobb) {
		this.jobb = jobb;
	}
double salary ;
   String rank ;
   String jobb ;
}
