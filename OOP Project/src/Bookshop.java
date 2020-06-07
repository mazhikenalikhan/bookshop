import java.sql.*;
public class Bookshop {

	public static void main(String[] args) {
		System.out.println("Welcome to our bookshop!");
		System.out.println("Please enter your login and password.");
		boolean k=true;
		while(k==true) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("","","");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}finally {
				k=false;
			}
		}
	}

}
