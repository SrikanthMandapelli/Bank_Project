<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FORGOT PASSWORD</title>
</head>

<body>
<center>
<form action="ForgotServlet" method="post">



<h1> PASSWORD OR USERNAME UPDATION</h1>

<pre>

USER NAME        : <input type="text" placeholder="Enter the userName" name="fn">

<br><br>

           PASSPHOTO        : <input type="file" name="pp">
<br><br>

PHONE NUMBER     : <input type="text" placeholder="Enter Phone Number" name="pn1">

<br><br>

</pre>

<input type="submit" value="Update"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="clear">

<br><br>
 <a href="Registration.jsp">signUp</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="Login.jsp">signIn</a>

</form>
</center>
</body>
</html>