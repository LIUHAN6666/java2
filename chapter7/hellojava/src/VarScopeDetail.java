public class VarScopeDetail{
	public static void main(String[] args) {
		P p = new P();
		p.say();
	}
	}
class P {
	String name = "jack";
	public void say() {
		String name = "king";
		System.out.println("name=" + name);
	}
}