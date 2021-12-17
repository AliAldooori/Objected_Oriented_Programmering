package Enum;

enum gender {male , fmale } ;
enum courses { database , programmering , math , ERP } ;
enum semester { summer , winter , fall , spring } ;
enum Day { sunday , monday , tuesday , wednsday , thursday , friday , saturday } ;
public class RegisterForm {
	
String studentName ;
gender gnd ;
courses crs ;
semester sms ;
Day day ;	

public RegisterForm () {
	
	studentName = "Ahmed";
	gnd = gender.male ;
	crs = courses.math ;
	sms = semester.winter ;
	
	
}

public RegisterForm(String studentName, gender gnd, courses crs, semester sms, Day day) {
	super();
	this.studentName = studentName;
	this.gnd = gnd;
	this.crs = crs;
	this.sms = sms;
	this.day = day;
}






}
