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
				    con=DriverManager.getConnection("jdbc:mysql://localhost:3306",userName,password);
				
			} catch (Exception e) {
				e.printStackTrace();
				k=true;
			}
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
				Statement stmt;
				try {
					stmt = con.createStatement();				
					ResultSet rs=stmt.executeQuery("select * from admin where number>0");
				while(rs.next())
				System.out.println("name:"+rs.getString(5)+"Author:"+rs.getString(4)+"number:"+rs.getInt(3)+"id:"+rs.getInt(1)+"price:"+rs.getFloat(2));
				} catch (SQLException e) {
					e.printStackTrace();
				}

				System.out.println("Enter 1 to return back to menu:");
			}
			if(DO==3) {
				System.out.println("Enter product id:");
				int id=myObj.nextInt();
				Statement stmt;
				try {
					stmt = con.createStatement();				
					ResultSet rs=stmt.executeQuery("select * from admin where id="+id);
				    Book re= new Book(rs.getString(5),rs.getString(4),rs.getInt(3),rs.getInt(1),rs.getFloat(2));
				    You.Add(re);
				} catch (SQLException e) {
					e.printStackTrace();
				}
				System.out.println("Enter 1 to return back to menu:");
			}
			if (DO==4) {
				System.out.println("Enter product id:");
				int id=myObj.nextInt();
				Statement stmt;
				try {
					stmt = con.createStatement();				
					ResultSet rs=stmt.executeQuery("select * from admin where id="+id);
					System.out.println("name:"+rs.getString(5)+"Author:"+rs.getString(4)+"number:"+rs.getInt(3)+"id:"+rs.getInt(1)+"price:"+rs.getFloat(2));
				} catch (SQLException e) {
					e.printStackTrace();
				}
				System.out.println("Enter 1 to return back to menu:");
			}
			DO=myObj.nextInt();
		}
		myObj.close();
	}
	
}
