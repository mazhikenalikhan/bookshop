package bookshop;

public class Book extends Product {
protected String Author;
protected String Name;
Book(String name, String Author, int number, int id, float price){
	super(number,id,price);
	this.Name=name;
	this.Author=Author;
}
String getName() {
	return this.Name;
}
String getAuthor() {
	return this.Author;
}
public String toString() {
	return "name:"+this.Name+"Author:"+this.Author+"number:"+this.number+"id:"+this.id+"price:"+this.price;
}
}