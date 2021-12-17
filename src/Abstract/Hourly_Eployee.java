package Abstract;


public class Hourly_Eployee extends Eployeee{

	double working_hour ;
	double hour_rate ;
	public Hourly_Eployee(String name, int age, double salary, String rank, String jobb, double working_hour,
			double hour_rate) {
		super(name, age, salary, rank, jobb);
		this.working_hour = working_hour;
		this.hour_rate = hour_rate;
	}
	public double getWorking_hour() {
		return working_hour;
	}
	public void setWorking_hour(double working_hour) {
		this.working_hour = working_hour;
	}
	public double getHour_rate() {
		return hour_rate;
	}
	public void setHour_rate(double hour_rate) {
		this.hour_rate = hour_rate;
	}
	@Override
	public String toString() {
		return "Hourly_Eployee [working_hour=" + working_hour + ", hour_rate=" + hour_rate + ", name=" + name + ", age="
				+ age + ", salary=" + salary + ", rank=" + rank + ", jobb=" + jobb + "]";
	}
	@Override
	public double totalsalary() {
		return this.working_hour + this.hour_rate;
	}
	
	
}
