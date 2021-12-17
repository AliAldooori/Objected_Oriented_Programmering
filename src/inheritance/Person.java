package inheritance;

public class Person {
	
	String name ;
	
	int age ;
	
	String nationality ;
	
	String adress ;

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", nationality=" + nationality + ", adress=" + adress + "]";
	}

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

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public Person(String name, int age, String nationality, String adress) {
		super();
		this.name = name;
		this.age = age;
		this.nationality = nationality;
		this.adress = adress;
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Person(String name) {
		super();
		this.name = name;
	}


}
