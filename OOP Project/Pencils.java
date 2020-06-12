
public class Pencils extends Product {
	protected String Company;
	protected String Color;
	Pencils(String Company, String Color,int number, int id, float price){
		super(number,id,price);
		this.Company=Company;
		this.Color=Color;
	}
	String getCompany(){
		return this.Company;	
	}
	String getColor(){
		return this.Color;
	}
	public String toString() {
		return 
				"Company:"+this.Company+"Color:"+this.Color+"number:"
				+this.number+"id:"+this.id+"price:"+this.price;
		
	}
}
