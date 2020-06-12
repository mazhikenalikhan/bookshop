
public class magazine extends Product {
	protected String Author;
	magazine(String Author, int number, int id, float price){
		super(number,id, price);
		this.Author=Author;
	}
	String getAuthor() {
		return this.Author;
	}
	public String toString{
		return 
		"Author:"+this.Author+"nubmer:"+this.number+"id:"+this.id+"price:"+this.price;
		
	}
}
