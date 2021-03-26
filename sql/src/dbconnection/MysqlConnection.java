package dbconnection;
import java.sql.*;
public class MysqlConnection {
	public static void main(String args[]) throws SQLException, ClassNotFoundException
	{
		
 Class.forName("com.mysql.jdbc.Driver");
 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/database","root","15036244");
 Statement st=con.createStatement();
 ResultSet rs=st.executeQuery(" select * from title ");
 while(rs.next())
 {
	 System.out.println(rs.getInt(1)+" "+rs.getString(2) +" "+rs.getDate(0));
 }
 st.close();
 con.close();
 }
}