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
				    System.out.println("Enter username:");
				    userName=myObj.nextLine(); 
				    System.out.println("Enter password:");
				    password=myObj.nextLine();
				    Class.forName("com.mysql.jdbc.Driver");
				    con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bookshop",userName,password);
				
			} catch (Exception e) {
				e.printStackTrace();
				k=true;
			}
		}
		booklist current=new booklist();
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
		Customer You=new Customer(userName);
		int DO=1;
		while(DO>0) {
			if (DO==1) {
				System.out.println("Enter 2 show to all products:");
				System.out.println("Enter 3 to buy product:");
				System.out.println("Enter 4 to select product:");
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
			DO=myObj.nextInt();
		}
		myObj.close();
	}
	
}
