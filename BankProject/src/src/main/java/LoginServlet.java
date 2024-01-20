package src.main.java;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
      
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		String query="select * from bank_project.bank_account where FULLNAME=? AND PHONENUMBER=?";
		
		try 
		{
			PrintWriter pw=res.getWriter();
			Class.forName("com.mysql.jdbc.Driver");
			try 
			{
				Connection connect=DriverManager.getConnection(url);
				PreparedStatement ps =connect.prepareStatement(query);
				ps.setString(1, req.getParameter("nm"));
				ps.setString(2, req.getParameter("pn"));
				req.setAttribute("url", url);
				ResultSet rs = ps.executeQuery();
				if(rs.next())
				{
					pw.println("Login Succesfully.....");
				}
				else
				{
					RequestDispatcher dispatcher=req.getRequestDispatcher("Registration.jsp");
					dispatcher.include(req, res);
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
