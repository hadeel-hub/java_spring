<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Login</h1>
<form action="/log" method="post">
<label>pick any number from 5 to 25</label><br>
<select>
<option>1</option>
</select><br>
<label>Enter the name of any city</label><br>
<input type="text" name="city"><br>
<label>Enter the name of any real person</label><br>
<input type="text" name="person"><br>
<label>Enter proffessional hoppy</label><br>
<input type="text" name="hoppy"><br>
<label>enter any type of living thing</label><br>
<input type="text" name="living"><br>
<label>say something nice to someone</label>
<textarea rows="30" cols="30" name="desc"></textarea>
<input type="submit" value="send">
<p> send and show a friend </p>
</form>
</body>
</html>