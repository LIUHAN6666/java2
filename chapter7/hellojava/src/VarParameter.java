public class VarParameter {
	public static void main(String[] args) {
		Hspmethod n = new Hspmethod();
		n.sum(1, 1);
		System.out.println(n.sum(1, 1));
	}
}
class Hspmethod {
	public int sum(int... nums) {
		System.out.println("接收的个数=" + nums.length);
		int res = 0;
		for(int i = 0; i < nums.length; i++ ) {
			res = res + nums[i];
			
		}
		return res;
	}
}