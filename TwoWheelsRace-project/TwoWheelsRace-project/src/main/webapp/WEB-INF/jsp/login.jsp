<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
 <link rel="stylesheet" type="text/css" href="resources/css/login.css"/>
<meta charset="ISO-8859-1">
<title>login</title>
</head>
<body>
<form  method = "POST" action="/login"   modelAttribute = "user_track">
  <div class = "loginform" align = "center">
	<h1 >Login</h1>
	
  <table id ="login" >
	 <tr>
      <td><label for ="userName"><b>Username</b></label></td>
       <td><input type="text" name="userName"  required/></td>
   </tr>
	<tr>
     <td><label for ="password"><b>Password</b></label></td>
      <td><input type="password" name="password" required/></td>
   </tr>
 </table>
    <div class = "remember" align = "center">
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
    </div>
     <button type="submit" class = "loginbtn">Login</button>   
     <table >
                <tr>
                    <td style="font-style: italic; color: red;">${message}</td>
                </tr>
      </table>
 </div>
 </form>
    
</body>
</html>