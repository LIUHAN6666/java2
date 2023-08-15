public class ConstructorExercise{
	public static void main(String[] args) {
		Pe p1 = new Pe();
		System.out.println("p1的信息=" + p1.age + " " + p1.name);
		Pe p2 = new Pe("保国", 45);
		System.out.println("p2的信息=" + p2.age + " " + p2.name);
	}
	}
class Pe {
	String name;
	int age;
	public Pe() {
		age = 18;
		
	}
	public Pe(String pname, int page) {
		name = pname;
		age = page;
	}
}