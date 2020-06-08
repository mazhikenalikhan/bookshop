
public class Book extends Product {
protected String Author;
protected String Name;
Book(String name, String Author, int number, int id, float price){
	super(number,id,price);
	this.Name=name;
	this.Author=Author;
}
}
