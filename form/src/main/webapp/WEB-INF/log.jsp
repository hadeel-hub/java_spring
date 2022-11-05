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
<h1> here is your Omikuji</h1><br>
<textarea rows="50" cols="100">
<p>in years, you will live in <c:out value="${city }"/> with <c:out value="${person }"></c:out>
as your roomate , doing <c:out value="${hoppy }"></c:out> the next time you see a <c:out value="${living }"></c:out> you will have good luck.
</textarea>
<a href="/">go back</a>
</body>
</html>