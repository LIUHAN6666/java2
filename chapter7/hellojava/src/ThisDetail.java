public class ThisDetail{
	public static void main(String[] args) {
		T t1 = new T();
		t1.f2();
	}
	}
class T {
	public void f1() {
		System.out.println("f1()方法");
	}
	public void f2() {
		System.out.println("f2()方法");
		f1();
		this.f1();
	}
}