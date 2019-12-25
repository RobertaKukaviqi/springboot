<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
   <link rel="stylesheet" type="text/css" href="resources/css/register.css"/>
<meta charset="ISO-8859-1">
<title>register</title>
</head>
<body>
	<form  method = "POST" action="/registration"  ModelAttribute = "user">
  <div style="text-align:center;" class="registerform">
   <h1 >Register</h1>
   <p >Please fill in this form to create an account.</p>
  
   <table id = "register">
	<tr>
 	<td><label for ="nid"><b>NID</b></label></td>
    <td><input  type = "text" name="nid"  required /></td>
	</tr>
	
	<tr>
    <td><label for ="firstName"><b>First Name</b></label></td>
    <td><input type="text"  name="firstName"   required/></td>
    </tr>
    
    <tr>
     <td><label for ="lastName"><b>Last Name</b></label></td>
    <td><input type="text" name="lastName"   required/></td>
    </tr>
    
   <tr>
    <td><label for ="username"><b>Username</b></label></td>
    <td><input type="text" name="userName"  required/></td>
   </tr>
   
   <tr>
   <td><label for ="password"><b>Password</b></label></td>
    <td><input type="password" name="password" required/></td>
   </tr>
   
   <tr>
   <td> <label for="confirmPassword"><b>Confirm Password</b></label></td>
   <td> <input type="password" name="confirmPassword"  required/></td>
   </tr>
    </table>

    <p style="text-align:center;">By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>
    <button type="submit" class="registerbtn" value = "registerUser">Register</button>
    	<div class="signin">
    		<p>Already have an account? <a href="/login">Login</a>.</p>
  		</div>
  </div>
		
  
</form>
</body>
</html>