package inheritance;

public class Hourly_Employee extends Employee{
	double Working_Hours ;
	double Hour_rate ;
	
	@Override
	public String toString() {
		return "Hourly_Employee [Working_Hours=" + Working_Hours + ", Hour_rate=" + Hour_rate + ", salary=" + salary
				+ ", rank=" + rank + ", jobb=" + jobb + ", name=" + name + ", age=" + age + ", nationality="
				+ nationality + ", adress=" + adress + "]";
	}
	public Hourly_Employee(String name, int age, String nationality, String adress, double salary, String rank,
			String jobb, double working_Hours, double hour_rate) {
		super(name, age, nationality, adress, salary, rank, jobb);
		Working_Hours = working_Hours;
		Hour_rate = hour_rate;
	}
	public double getWorking_Hours() {
		return Working_Hours;
	}
	public void setWorking_Hours(double working_Hours) {
		Working_Hours = working_Hours;
	}
	public double getHour_rate() {
		return Hour_rate;
	}
	public void setHour_rate(double hour_rate) {
		Hour_rate = hour_rate;
	}

}
