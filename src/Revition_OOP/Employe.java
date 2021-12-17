package Revition_OOP;
enum Gender {male , fmale } ;
public abstract class Employe {
String name ;
int ssn ;
String adress ;
Gender gnd ;

public Employe() {
	super();
}
@Override
public String toString() {
	return "Employe [name=" + name + ", ssn=" + ssn + ", adress=" + adress + ", gnd=" + gnd + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSsn() {
	return ssn;
}
public void setSsn(int ssn) {
	this.ssn = ssn;
}
public String getAdress() {
	return adress;
}
public void setAdress(String adress) {
	this.adress = adress;
}
public Employe(String name, int ssn, String adress, Gender gnd) {
	super();
	this.name = name;
	this.ssn = ssn;
	this.adress = adress;
	this.gnd = gnd;
}
public Gender getGnd() {
	return gnd;
}
public void setGnd(Gender gnd) {
	this.gnd = gnd;
}
public abstract double earning ();

}
