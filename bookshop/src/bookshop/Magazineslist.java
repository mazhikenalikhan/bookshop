package bookshop;
import java.util.Vector;
public class Magazineslist {
		protected Vector<Magazine> mlist;
		Magazineslist(){
			Vector<Magazine> r=new Vector<Magazine>();
			this.mlist=r;
		}
		void add(Magazine now) {
			this.mlist.add(now);
		}
		void buy(Customer You,int id) {
			int l=0;
			int r=this.mlist.size()-1;
			boolean k=false;
			while(l<=r) {
				int mid=(l+r)/2;
				int thisid=this.mlist.get(mid).getId();
				if(id>thisid)l=mid+1;
				if(id<thisid)r=mid-1;
				if(id==thisid) { You.mAdd(this.mlist.get(mid));k=true;break;}
			}	
			if(k)System.out.println("Bought");
			else System.out.println("Magazine wasn't found.");
		}
		void showall() {
			for(int i=0;i<this.mlist.size();i++) {
				System.out.println(this.mlist.get(i));
			}
		}
		void get(int id) {
			int l=0;
			int r=this.mlist.size()-1;
			boolean k=true;
			while(l<=r) {
				int mid=(l+r)/2;
				int thisid=this.mlist.get(mid).getId();
				if(id>thisid)l=mid+1;
				if(id<thisid)r=mid-1;
				if(id==thisid) {System.out.println(this.mlist.get(mid));k=false;break;}
			}	
			if(k)System.out.println("Magazine wasn't found.");
		}
	}
