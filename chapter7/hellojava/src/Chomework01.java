public class Chomework01{
	public static void main(String[] args) {
		String[] strs = {"jack", "chen", "bob", "marry"};
		A02 a02 = new A02();
		int index = a02.find("ch", strs);
		System.out.println("查找的index=" + index);
	}
	}
class A02 {
	public int find (String findStr, String[] strs) {
		for ( int i= 0; i < strs.length; i++) {
			if(findStr.equals(strs[i])) {
				return i;
			}
		}
		return -1;
	}
}