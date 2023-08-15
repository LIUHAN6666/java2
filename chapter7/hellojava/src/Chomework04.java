public class Chomework04{
	public static void main(String[] args) {
		//double radius = 3;
		Crice c = new Crice(23);
		System.out.print(c.Len() + " " + c.area());
	}
	}
class Crice {
	double radius;
	public Crice (double radius) {
		this.radius = radius;
	}
	public double area() {
		return radius * radius * Math.PI;
		
	}
	public double Len() {
		return radius * 2 * Math.PI;
	}
}