package Abstract;

public abstract class Eployeee {
String name ;
	
	int age ;
	
	double salary ;
	
	String rank ;
	String jobb ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getJobb() {
		return jobb;
	}
	public void setJobb(String jobb) {
		this.jobb = jobb;
	}
	@Override
	public String toString() {
		return "Eployee [name=" + name + ", age=" + age + ", salary=" + salary + ", rank=" + rank + ", jobb=" + jobb
				+ "]";
	}
	public Eployeee(String name, int age, double salary, String rank, String jobb) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.rank = rank;
		this.jobb = jobb;
	}
   public abstract double totalsalary ();

}

