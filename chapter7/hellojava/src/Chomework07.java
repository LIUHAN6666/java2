public class Chomework07{
	public static void main(String[] args) {
		Employee E = new Employee("HH", '女', 18, "boss", 50.6);
		System.out.println(E.name + " " + E.gender + " " + E.age + " "
				+ E.job + " " + E.sal);
	}
	}
class Employee {
	String name;
	char gender;
	int age;
	String job;
	double sal;
	public Employee(String job, double sal) {
		this.job = job;
		this.sal = sal;
	}
	public Employee(String name, char gender, int age ) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public Employee(String name, char gender, int age, 
			String job, double sal) {
		this(name, gender, age);
		this.job = job;
		this.sal = sal;
	}
} 