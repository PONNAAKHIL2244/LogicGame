package dbconnection;

import java.sql.*;


public class Select {
	public static void main(String args[]) throws SQLException, ClassNotFoundException
	{
		
 Class.forName("com.mysql.jdbc.Driver");
 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/database","root","15036244");
 Statement st=con.createStatement();
 int rs=st.executeUpdate(" insert into title values(12,'Manager','2017-02-28 ' )");
 System.out.println(rs +"rows effected");
}
	
}
