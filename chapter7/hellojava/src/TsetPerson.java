public class TsetPerson{
	public static void main(String[] args) {
		Pn p1 = new Pn("丁真", 23);
		Pn p2 = new Pn("丁真", 23);
		System.out.println(p1.compareTo(p2));
	}
	}
class Pn {
	String name;
	int age;
public Pn(String name, int age) {
	this.name = name;
	this.age = age;
    }
public boolean compareTo(Pn p) {
	if(this.name.equals(p.name) && this.age == p.age) {
		return true;
	} else {
		return false;
	}
	
}
}