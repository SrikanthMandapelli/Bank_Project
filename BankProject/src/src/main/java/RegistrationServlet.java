package src.main.java;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		
		
		String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		String query="insert into bank_project.bank_account values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try 
		    {
		    	
		    	PrintWriter pw=resp.getWriter();
				Connection con =DriverManager.getConnection(url);
				PreparedStatement ps =con.prepareStatement(query);
				ps.setString(1, req.getParameter("name"));
				ps.setString(2, req.getParameter("fn"));
				ps.setString(3, req.getParameter("pn"));
				ps.setString(4, req.getParameter("em"));
				ps.setString(5, req.getParameter("ac"));
				ps.setString(6, req.getParameter("ci"));
				ps.setString(7, req.getParameter("add"));
				ps.setString(8, req.getParameter("cv"));
				ps.setString(9, req.getParameter("pin"));
				ps.setString(10, req.getParameter("dist"));
				ps.setString(11, req.getParameter("state"));
				ps.setString(12, req.getParameter("dob"));
				ps.setString(13, req.getParameter("photo"));
				int num=ps.executeUpdate();
				if(num>0)
				{
					pw.println("Registration succesfull...");
				}
				else
				{
					RequestDispatcher rs =req.getRequestDispatcher("www.naukri.com");
					rs.include(req, resp);
				}
			}
		    catch (SQLException e)
		    {
				
				e.printStackTrace();
			}
		} 
		catch (ClassNotFoundException e1)
		{
			
			e1.printStackTrace();
		}
	    
	    
		
	}

}
