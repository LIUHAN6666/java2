public class Chomework03{
	public static void main(String[] args) {
		A a = new A();
		int[]oldarr = {95, 43, 52};
		 int[] newarr = a.copyarr(oldarr);
		 for (int i = 0; i < oldarr.length; i++) {
			 System.out.print(newarr[i] + " ");
		 }
	}
	}
class A {
	public int[]copyarr(int[]oldarr ) {
		int[] newarr =  new int [oldarr.length];
		for (int i = 0; i < oldarr.length; i++) {
			newarr[i] = oldarr[i];
		}
		return newarr;
	}
}