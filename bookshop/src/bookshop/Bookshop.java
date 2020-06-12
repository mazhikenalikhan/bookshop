package bookshop;
import java.sql.*;
import java.util.Scanner; 
import java.util.*;
public class Bookshop {

	public static void main(String[] args) {		    
		Scanner myObj = new Scanner(System.in);
		System.out.println("Welcome to our bookshop!");
		String userName = null;
		String password;
		Connection con = null;
		boolean k=true;
		while(k) {
			k=false;
			try {				
				    Class.forName("com.mysql.jdbc.Driver");
				    con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bookshop","root","Aboshsuper3");
				
			} catch (Exception e) {
				e.printStackTrace();
				k=true;
			}
		}
		k=true;
		while(k) {
					System.out.println("Enter username:");
				    userName=myObj.nextLine(); 
				    System.out.println("Enter password:");
				    password=myObj.nextLine();
				    Statement stmt2;
					try {
						stmt2 = con.createStatement();				
						ResultSet rs1=stmt2.executeQuery("SELECT * FROM `users` WHERE `email`='"+userName+"'and `pass`='"+password+"'");
						if(rs1.next()) {
							k=false;
						}
					} catch (SQLException e) {
						e.printStackTrace();
					}
		}
		booklist current=new booklist();
		Magazineslist mcurrent=new Magazineslist();
		Pencilslist pcurrent=new Pencilslist();
		Statement stmt;
		try {
			stmt = con.createStatement();				
			ResultSet rs=stmt.executeQuery("SELECT * FROM `admin` WHERE `number`>0");
		while(rs.next())
		{
		    Book re= new Book(rs.getString(4),rs.getString(5),rs.getInt(3),rs.getInt(1),rs.getFloat(2));
		    current.add(re);
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Statement stmtm;
		try {
			stmtm = con.createStatement();				
			ResultSet rsm=stmtm.executeQuery("SELECT * FROM `magazine` WHERE `number`>0");
		while(rsm.next())
		{
		    Magazine rem=new Magazine(rsm.getString(4),rsm.getInt(2),rsm.getInt(1),rsm.getFloat(3));
		    mcurrent.add(rem);
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Statement stmtp;
		try {
			stmtp = con.createStatement();				
			ResultSet rsp=stmtp.executeQuery("SELECT * FROM `pencil` WHERE `number`>0");
		while(rsp.next())
		{
		    Pencils rep=new Pencils(rsp.getString(5),rsp.getString(4),rsp.getInt(2),rsp.getInt(1),rsp.getFloat(3));
		    pcurrent.add(rep);
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Customer You=new Customer(userName);
		int DO=1;
		while(DO>0) {
			if (DO==1) {
				System.out.println("Enter 2 show to all products:");
				System.out.println("Enter 3 to buy book product:");
				System.out.println("Enter 4 to select book product:");
				System.out.println("Enter 5 to buy magazine product:");
				System.out.println("Enter 6 to select magazine product:");
				System.out.println("Enter 7 to buy pencil product:");
				System.out.println("Enter 8 to select pencil product:");
				System.out.println("Enter 0 to close all:");
			}
			if(DO==2) {
				current.showall();
				System.out.println("Enter 1 to return back to menu:");
			}
			if(DO==3) {
				System.out.println("Enter product id:");
				int id=myObj.nextInt();
				current.buy(You, id);
				System.out.println("Enter 1 to return back to menu:");
			}
			if (DO==4) {
				System.out.println("Enter product id:");
				int id=myObj.nextInt();
				current.get(id);
			}
			if(DO==5) {
				System.out.println("Enter product id:");
				int id=myObj.nextInt();
				mcurrent.buy(You, id);
				System.out.println("Enter 1 to return back to menu:");
			}
			if (DO==6) {
				System.out.println("Enter product id:");
				int id=myObj.nextInt();
				mcurrent.get(id);
			}
			if(DO==7) {
				System.out.println("Enter product id:");
				int id=myObj.nextInt();
				pcurrent.buy(You, id);
				System.out.println("Enter 1 to return back to menu:");
			}
			if (DO==8) {
				System.out.println("Enter product id:");
				int id=myObj.nextInt();
				pcurrent.get(id);
			}
			DO=myObj.nextInt();
		}
		myObj.close();
	}
	
}
