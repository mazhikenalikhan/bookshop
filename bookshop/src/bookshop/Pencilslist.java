package bookshop;
import java.util.Vector;
public class Pencilslist {
		protected Vector<Pencils> plist;
		Pencilslist(){
			Vector<Pencils> r=new Vector<Pencils>();
			this.plist=r;
		}
		void add(Pencils now) {
			this.plist.add(now);
		}
		void buy(Customer You,int id) {
			int l=0;
			int r=this.plist.size()-1;
			boolean k=false;
			while(l<=r) {
				int mid=(l+r)/2;
				int thisid=this.plist.get(mid).getId();
				if(id>thisid)l=mid+1;
				if(id<thisid)r=mid-1;
				if(id==thisid) { You.pAdd(this.plist.get(mid));k=true;break;}
			}	
			if(k)System.out.println("Bought");
			else System.out.println("Pencil wasn't found.");
		}
		void showall() {
			for(int i=0;i<this.plist.size();i++) {
				System.out.println(this.plist.get(i));
			}
		}
		void get(int id) {
			int l=0;
			int r=this.plist.size()-1;
			boolean k=true;
			while(l<=r) {
				int mid=(l+r)/2;
				int thisid=this.plist.get(mid).getId();
				if(id>thisid)l=mid+1;
				if(id<thisid)r=mid-1;
				if(id==thisid) {System.out.println(this.plist.get(mid));k=false;break;}
			}	
			if(k)System.out.println("Pencil wasn't found.");
		}
	}
