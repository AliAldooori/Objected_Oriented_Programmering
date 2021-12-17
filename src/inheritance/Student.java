package inheritance;

public class Student extends Person{

	int study_level ;
	String spesilaization ;
	double GPA;
	public Student(String name, int age, String nationality, String adress, int study_level, String spesilaization,
			double gPA) {
		super(name, age, nationality, adress);
		this.study_level = study_level;
		this.spesilaization = spesilaization;
		GPA = gPA;
	}
	public int getStudy_level() {
		return study_level;
	}
	public void setStudy_level(int study_level) {
		this.study_level = study_level;
	}
	public String getSpesilaization() {
		return spesilaization;
	}
	public void setSpesilaization(String spesilaization) {
		this.spesilaization = spesilaization;
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	@Override
	public String toString() {
		return "Student [study_level=" + study_level + ", spesilaization=" + spesilaization + ", GPA=" + GPA + ", name="
				+ name + ", age=" + age + ", nationality=" + nationality + ", adress=" + adress + "]";
	}
}
