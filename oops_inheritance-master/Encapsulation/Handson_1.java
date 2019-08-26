class Author{

	String name,email;
	char gender;
	
	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
		
	@Override
	public String toString() {
		
		return "Author: "+name+" Email: "+email+" Gender: "+gender;
	}
}

class Book{
	String name;
	double price;
	int qtyInStock;
	Author author=null;
	
	public Book(String name, double price, int qtyInStock, Author author) {
		this.name = name;
		this.price = price;
		this.qtyInStock = qtyInStock;
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQtyInStock() {
		return qtyInStock;
	}

	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	
	
	
}
public class Handson_1 {

	public static void main(String[] args) {
		
		Author author = new Author("Dan Brown", "danBrown@gmail.com",'M');
		
		Book book = new Book("Inferno", 400.80, 20,author);
		
		System.out.println("Book: "+book.getName()+" Price: "+book.getPrice()+" Qty: "+book.getQtyInStock()+
				" "+book.getAuthor().toString());
		
		Author author1 = new Author("Stefan King", "setfanKing@gmail.com",'M');
		
		Book book1 = new Book("The Body", 300.50, 25,author1);
		
		System.out.println("Book: "+book1.getName()+" Price: "+book1.getPrice()+" Qty: "+book1.getQtyInStock()+
				" "+book1.getAuthor().toString());
	}

}