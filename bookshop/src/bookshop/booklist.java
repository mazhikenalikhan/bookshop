package bookshop;
import java.util.Vector;
public class booklist {
	protected Vector<Book> booklist;
	booklist(){
		Vector<Book> r=new Vector<Book>();
		this.booklist=r;
	}
	void add(Book now) {
		this.booklist.add(now);
	}
	void buy(Customer You,int id) {
		int l=0;
		int r=this.booklist.size()-1;
		boolean k=false;
		while(l<=r) {
			int mid=(l+r)/2;
			int thisid=this.booklist.get(mid).getId();
			if(id>thisid)l=mid+1;
			if(id<thisid)r=mid-1;
			if(id==thisid) { You.Add(this.booklist.get(mid));k=true;break;}
		}	
		if(k)System.out.println("Bought");
		else System.out.println("Book wasn't found.");
	}
	void showall() {
		for(int i=0;i<this.booklist.size();i++) {
			System.out.println(this.booklist.get(i));
		}
	}
	void get(int id) {
		int l=0;
		int r=this.booklist.size()-1;
		boolean k=true;
		while(l<=r) {
			int mid=(l+r)/2;
			int thisid=this.booklist.get(mid).getId();
			if(id>thisid)l=mid+1;
			if(id<thisid)r=mid-1;
			if(id==thisid) {System.out.println(this.booklist.get(mid));k=false;break;}
		}	
		if(k)System.out.println("Book wasn't found.");
	}
}

