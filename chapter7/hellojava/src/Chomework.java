public class Chomework{
	public static void main(String[] args) {
		 A01 a = new A01();
		 double[] arr = null;
		 Double res = a.max(arr);
		 if(res != null) {
		 System.out.println("arr的最大值=" + res);
	  }  else {
		 System.out.println("输入的内容有错误");			
	  }
	}
}
class A01 {
	public Double max (double[]arr) {
		if( arr != null && arr.length > 0) {
			double max = arr[0];
			for (int i = 1; i < arr.length; i++) {
			   if(max < arr[i]) {
				max = arr[i];
			}
		}
			return max;
		} else {
			return null;
	   }
	}
}
