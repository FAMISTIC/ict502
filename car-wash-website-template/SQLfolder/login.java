import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class login {
	public static void main(String[] args){
	try{
		//step1 load the driver class
		Class.forName("com.mysql.jdbc.Driver");
		//step2 create the connection object
		Connection con= DriverManager.getConnection
		("jdbc:mysql://localhost/CSC584","root","");
		//step3 create the statement object
		Statement stmt = con.createStatement();
		String sql = "SELECT ";
		
		//step4 execute query
		stmt.executeUpdate(sql);
		
		//step5 close the connection object
		con.close();
		}catch(Exception e){
		System.out.println(e);
		}
}
	}