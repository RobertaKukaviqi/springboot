<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
   <link rel="stylesheet" type="text/css"  href="resources/css/user-home.css"/>
<meta charset="ISO-8859-1">
<title>register</title>
</head>
<body>
<form  method = "POST"  action = "/user"  modelAttribute = "user_track">
<h1 align ="center">Mireserdhe ${firstname}</h1>
<div class ="wrap">
<div class = "table" align = "center">
<h2>Krijo nje korsi te re </h2>

<table class = "track">

 <tr>
	<td>	
	  <label for = "name" >Krijo nje gare:  </label>
	
	  <select id = "name" name = "track" >
			<option> Tirane_Durres </option>
			<option> Tirane_Vore </option>
			<option> Tirane_Elbasan </option>
			<option> Tirane_Kashar </option>
			<option> Vore_Durres </option>
			<option> Elbasan_Durres </option>
			<option> Elbasan_Vore </option>
		</select>
   </td>
 </tr>
 <tr>
  <td><label for = "bday" >Vendos daten:  </label><input id = "bday" type="date" name="date_create"></td>  
 </tr> 
 <tr> </tr>
</table>
<input id = "btn" type="submit" value="Krijo">	
</div>	

  <table >
           <tr>
               <td style="font-style: italic; color: red;">${messageCreate}</td>
           </tr>
      </table>
<div class =table2 align = "center" >
<h2>Apliko ne nje gare</h2>

</div>	
</div>
</form>
</body>
</html>