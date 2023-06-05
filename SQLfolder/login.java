import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.text.DecimalFormat;
import java.io.*;
import java.text.DecimalFormat;

@WebServlet("/login")
public class login extends HttpServlet {
	public static void main(String[] args){
		try{
			//step1 load the driver class
			Class.forName("com.mysql.jdbc.Driver");
			//step2 create the connection object
			Connection con= DriverManager.getConnection
			("jdbc:mysql://localhost/carwash","root","");
			//step3 create the statement object
			Statement stmt = con.createStatement();
			String sql = "SELECT email, phone FROM customer " + "WHERE email='"+email+"' AND phone='"+phone+'" ;
			
			//step4 execute query
			stmt.executeUpdate(sql);
			
			//step5 close the connection object
			con.close();
			}catch(Exception e){
			System.out.println(e);
			}
}
}
	protected void doPost (HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		DecimalFormat df = new DecimalFormat();
		response.setContentType("text/html;charser=UTF-8");
		PrintWriter out = response.getWriter();
		
		//getting value submitted in form from HTML file
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		
		out.println("<form method='post' action=''>");
		out.println("<h1>In-home Daycare Service Quotation</h1>");
		out.println("Phone Number:"+phone+"<br>");
		out.println("Email:"+email+"<br>");
		
		out.println("</form>");
	
	
	}