package bookshop;
import java.util.Vector;
public class Customer {
protected String username;
protected Vector<Book> list;
protected Vector<Magazine> mlist;
protected Vector<Pencils> plist;
 Customer(String s){
	this.username=s;
}
 void Add(Book l) {
	 this.list.add(l);
 }
 void mAdd(Magazine l) {
	 this.mlist.add(l);
 }
 void pAdd(Pencils l) {
	 this.plist.add(l);
 }
}
