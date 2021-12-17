package inheritance;

public class Person_main {

	public static void main(String[] args) {

		Student s1 = new Student("Ahmed", 20, "irak","Göteborg", 5, "IT", 3) ;
		
		
		System.out.println(s1.getGPA());
		
		
		Hourly_Employee h1 = new Hourly_Employee("Ali", 36, "irak","Stockholm", 19000, "tekniker", "engineer", 5.5, 2.5);
		
		Salaried_Employee sa = new Salaried_Employee("Anas", 40, "china", "Sollentuna", 25000, "Taxi-Stockholm", "engineer", 1500, 250) ;
	}

}
