
public abstract class Product {
protected float price;
protected int number;
protected int id;
Product(int number,int id,float price){
	this.number=number;
	this.id=id;
	this.price=price;
}
void setPrice(float x) {
	this.price=x;
}
void setNumber(int x) {
	this.number=x;
}
void setId(int x) {
	this.id=x;
}
}
