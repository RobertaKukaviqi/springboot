<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css"  href="resources/css/admin-home.css"/>
<meta charset="ISO-8859-1">
<title>admin</title>
</head>
<body>
<h1 align = "center" >WELCOME ADMIN</h1>

<div class ="wrap">
<div class = "div1" align = "center">
<h2><u>Valido perdoruesit</u></h2>
 <table class = "table1">
 <tr>
     <th>NID</th>
     <th>Emer</th>
     <th>Mbiemer</th>
     <th>Username</th>
     <th style = "color:red;">-Valido- </th>
    </tr>
	  <c:forEach var="user" items="${listUser}">
			<tr>
				<td>
				  <c:out value="${user.nid}"/>
                </td>
				<td>
				   <c:out value= " ${user.firstName}"/>
                </td>
				<td> 
			       <c:out value= "${user.lastName}"/>
				</td>
				<td>
				  <c:out value= "${user.userName}"/>
				 </td>
				<td contenteditable='true'> "${user.status}" </td>
			</tr>
			
		</c:forEach>
		<tr></tr>
</table>
	<form method="POST" method = "validate"><input id = "btn" type="submit" value="Valido"></form>

</div>	
<div class =div2 align = "center" >
<h2><u>Korsite e garave</u></h2>

</div>		
</div>
</body>
</html>