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

@WebServlet("/register")
public class register {
    protected void doPost (HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		double price=0.00,totalPerDay = 0.00,total = 0.00, totalAfterDiscount=0.00;
		DecimalFormat df = new DecimalFormat();
		response.setContentType("text/html;charser=UTF-8");
		PrintWriter out = response.getWriter();
		
		//getting value submitted in form from HTML file
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String gender = request.getParameter("gender");
		int duration=Integer.parseInt(request.getParameter("duration"));
		String day = request.getParameter("day");
		int number=Integer.parseInt(request.getParameter("number"));
	public static void main(String[] args){
	try{
		//step1 load the driver class
		Class.forName("com.mysql.jdbc.Driver");
		//step2 create the connection object
		Connection con= DriverManager.getConnection
		("jdbc:mysql://localhost/carwash","root","");
		//step3 create the statement object
		Statement stmt = con.createStatement();
		String sql = "SELECT * FROM customer WHERE email = '' ";
		
		//step4 execute query
		stmt.executeUpdate(sql);
		
		//step5 close the connection object
		con.close();
		}catch(Exception e){
		System.out.println(e);
		}
}
	}