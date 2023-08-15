public class Constructor{
	public static void main(String[] args) {
		Person p1 = new Person  ("smich", 80);
		System.out.println(p1.name + p1.age);
		Person p2 = new Person  ("smich");
		System.out.println(p2.name);
	}
	}
class Person  {
	String name;
	int age;
	public Person (String pname, int page) {  //构造器
		name = pname;
		age = page;
	}
	public Person (String pname) {  //构造器
		name = pname;
	}
}