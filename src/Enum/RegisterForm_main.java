package Enum;

public class RegisterForm_main {

	public static void main(String[] args) {
		
		courses c1 = courses.database ;
		courses c2 = courses.math ;
		System.out.println(c1.toString());
		System.out.println(c1.ordinal());
		System.out.println(c1.compareTo(c2));

		gender g1 = gender.male ;
		gender g2 = gender.fmale;
		
		System.out.println(g1.toString());
		System.out.println(g2.toString());
		
		System.out.println(Day.friday);
		Day d1 = Day.friday ;
		
	System.out.println(Day.sunday);
	
		
	}

}
