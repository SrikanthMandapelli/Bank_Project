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

@WebServlet("/ForgotServlet")
public class ForgotServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
	
		String url ="jdbc:mysql://localhost:3306?user=root&password=12345";
		String query="update bank_project.bank_account set PASSPHOTO=? where FULLNAME=? AND PHONENUMBER=?";
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			PrintWriter wr =resp.getWriter();
			try 
			{
				Connection con = DriverManager.getConnection(url);
				PreparedStatement ps =con.prepareStatement(query);
				
				ps.setString(1, req.getParameter("pp"));
				ps.setString(2, req.getParameter("fn"));
				ps.setString(3, req.getParameter("pn1"));
				
			    int num=ps.executeUpdate();
			    
			    if(num>0)
			    {
			      wr.print("Password Updated....!");
						
			    }
			    else
				{
					RequestDispatcher rs=req.getRequestDispatcher("Forgot.jsp");
					rs.include(req, resp);
				}
			
			}
			catch (SQLException e)
			{
				
				e.printStackTrace();
			}
			
		} 
		catch (ClassNotFoundException e) 
		{


			e.printStackTrace();
		}
		
	}

}
