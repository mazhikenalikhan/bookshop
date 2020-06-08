import java.util.Vector;

public class Customer {
protected String username;
protected Vector<Book> list;
 Customer(String s){
	this.username=s;
}
 void Add(Book l) {
	 this.list.add(l);
 }
}
