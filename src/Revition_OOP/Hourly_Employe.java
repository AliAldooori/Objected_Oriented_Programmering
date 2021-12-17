package Revition_OOP;

public class Hourly_Employe extends Employe  implements Dissplayable {

	double Hour_rate ;
	int no_of_hour ;
	
	
	public Hourly_Employe(String name, int ssn, String adress, Gender gnd, double hour_rate, int no_of_hour) {
		super(name, ssn, adress, gnd);
		Hour_rate = hour_rate;
		this.no_of_hour = no_of_hour;
	}
	@Override
	public String toString() {
		return "Hourly_Employe [Hour_rate=" + Hour_rate + ", no_of_hour=" + no_of_hour + ", name=" + name + ", ssn="
				+ ssn + ", adress=" + adress + "]";
	}
	public double getHour_rate() {
		return Hour_rate;
	}
	public void setHour_rate(double hour_rate) {
		Hour_rate = hour_rate;
	}
	public int getNo_of_hour() {
		return no_of_hour;
	}
	public void setNo_of_hour(int no_of_hour) {
		this.no_of_hour = no_of_hour;
	}
	
	@Override
	public double earning() {
		
		return (Hour_rate * no_of_hour) ;
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
