package libraryManagementSystem;

import java.sql.*;

public class Conn {
	Connection c;
	Statement s;

	public Conn() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String username = "root" , password = "";
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarymanagementsystem",username,password);
			s = c.createStatement();
			
		} catch(Exception e) {
			System.out.println(e); 
		}
	}
	
}