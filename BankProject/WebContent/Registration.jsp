<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>

</head>

<body style="background-color:pink">


<form action="RegistrationServlet" method="post">

<div >
<pre>

FULL NAME    : <input type="text"   placeholder="Enter the name" name="name">                                  FATHER NAME   : <input type="text" placeholder="Enter the father name" name="fn">


PHONE NUMBER : <input type="number" placeholder="Phone number" name="pn">                                  EMAIL ID      : <input type="email" placeholder="Enter the email" name="em">


ACC NUMBER   : <input type="number" placeholder="Account Number" name="ac">                                  CUSTOMER ID   : <input type="text" placeholder="Customer Id" name="ci">  


ADDRESS      : <input type="text"   placeholder="Enter Addres" name="add">                                  VILLAGE/CITY  : <input type="text" placeholder="Enter city / village" name="cv">


PINCODE      : <input type="number" placeholder="Enter Pincode" name="pin">                                  DISTRICT      : <input type="text" placeholder="Enter District" name="dist">

</pre>



STATE NAME   : <select name="state">                                                               
<option>SELECT</option>
<option>ANDHRA PRADESH</option>
<option>TELANADU </option>
<option>TAMIL NADU   </option>
<option>MADYA PRADESH</option>
<option>GOA</option>
<option>NEW DELHI</option>
<option>MAHARASTRA</option>
<option>PUNE</option>
<option>HIMACHAL</option>
</select> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; DATE OF BIRTH :  <input type="date" placeholder="date of birth " name="dob"> 


<pre>

PASS PHOTO   : <input type="file" name="photo" accept=".jpg, .jpeg, .png" required="required">                               </pre>








<pre>                                               Already user <a href="Login.jsp">sign in</a>       <input type="submit" value="signUp">    <input type="reset" value="clear">                              </pre>  

</div>
</form>


</body>
</html>