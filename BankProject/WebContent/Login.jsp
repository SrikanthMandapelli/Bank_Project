<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>

<body >
<center>

<form action="LoginServlet" method="post">

<div style="border: 2px solid white;border-bottom-color:blue; background-color:lightpink; height: 100vh;width: 100vw" >

<h1 style="font-size: 50px; color: red;" > WELCOME TO LOGIN PAGE </h1>


ENTER THE NAME  : <input style="margin-top:80px; " type="text" placeholder="Enter the name" name="nm">

<br><br>

ENTER THE EMAIL :<input type="text" placeholder="Enter the phone" name="pn">

<br><br>

<input style="margin-top:40px " type="submit" value="Login"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="reset" value="clear">

<br><br>

new user ? <a href="Registration.jsp">sign up</a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Forgot <a href="Forgot.jsp">forgot password or username </a>


</div>

</form>
</center>
</body>
</html>