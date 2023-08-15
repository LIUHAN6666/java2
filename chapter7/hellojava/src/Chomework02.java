public class Chomework02{
	public static void main(String[] args) {
		Book book = new Book("こごろ", 488);
		book.info();
		book.updateprice();
		book.info();
	}
	}
class Book {
	String name;
	double price;
	public Book(String name, double price) {
		this.name = name;
		this.price = price;
	}
	public void updateprice() {
		if(this.price > 150) {
			price = 150;
		} else if (price > 100) {
			price = 100;
		}
	}
	public void info() {
		System.out.println("书名=" + this.name + "　　　价格=" + this.price);
	}
}