package Revition_OOP;

public class Commetion_employee extends Employe implements Dissplayable{
	double Gross_sales ;
	double Commetion_rate ;

	public double getGross_sales() {
		return Gross_sales;
	}
	public void setGross_sales(double gross_sales) {
		Gross_sales = gross_sales;
	}
	public double getCommetion_rate() {
		return Commetion_rate;
	}
	public void setCommetion_rate(double commetion_rate) {
		Commetion_rate = commetion_rate;
	}
	@Override
	public String toString() {
		return "Commetion_employee [Gross_sales=" + Gross_sales + ", Commetion_rate=" + Commetion_rate + ", name="
				+ name + ", ssn=" + ssn + ", adress=" + adress + "]";
	}
	
	

	public Commetion_employee(String name, int ssn, String adress, Gender gnd, double gross_sales,
			double commetion_rate) {
		super(name, ssn, adress, gnd);
		Gross_sales = gross_sales;
		Commetion_rate = commetion_rate;
	}
	@Override
	public double earning() {
		
		return Gross_sales * Commetion_rate;
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
