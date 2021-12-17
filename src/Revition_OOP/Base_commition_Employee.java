package Revition_OOP;

public class Base_commition_Employee extends Commetion_employee  {

	@Override
	public double earning() {
		// TODO Auto-generated method stub
		return super.earning() + base ;
	}

	@Override
	public void display_all_detailes() {
		super.display_all_detailes();
		System.out.println(toString());
	}

	@Override
	public void display_earnings() {
		// TODO Auto-generated method stub
		super.display_earnings();
		System.out.println(earning());
	}

	double base ;

	
	public Base_commition_Employee(String name, int ssn, String adress, Gender gnd, double gross_sales,
			double commetion_rate, double base) {
		super(name, ssn, adress, gnd, gross_sales, commetion_rate);
		this.base = base;
	}

	@Override
	public String toString() {
		return "Base_commition_Employee [base=" + base + ", Gross_sales=" + Gross_sales + ", Commetion_rate="
				+ Commetion_rate + ", name=" + name + ", ssn=" + ssn + ", adress=" + adress + ", gnd=" + gnd + "]";
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}


}
