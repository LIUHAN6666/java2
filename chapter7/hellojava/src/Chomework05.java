public class Chomework05{
	public static void main(String[] args) {
		Cale cale = new Cale(4, 0);
		Double divres = cale.div();
		if (divres != null) {
			System.out.print("除=" + divres);
		}
		System.out.print("\n" + cale.sum() + " " + cale.minus() + " " +
				cale.mul());
	}
}
class Cale {
	double num1;
	double num2;
	public Cale (double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public double sum () {
		return num1 + num2;
	}
	public double minus () {
		return num1 - num2;
	}
	public double mul () {
		return num1 * num2;
	}
	public Double div () {
		if(num2 == 0) {
			System.out.print("不能为0");
			return null;
		} else {
			return num1 / num2;
		}	
	}
}
