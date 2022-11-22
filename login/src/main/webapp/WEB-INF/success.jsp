<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Navigation Bar</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initaial-scale=1.0">
	<link rel="stylesheet" type="text/css" href="css/style1.css">
</head>
<body>
<nav>
		<div class="logo">
			<p>navbar</p>
		</div>
		<ul>
			<li><a href="" class="active">home</a></li>
			<li><a href="">about</a></li>
			<li><a href="">services</a></li>
			<li><a href="">portfolio</a></li>
			<li><a href="">contact</a></li>
		</ul>
	</nav>
	 <form:form action="/event" method="post" modelAttribute="event">
	<div >
        <form:label path="userName">User Name:</form:label>
        <form:input path="userName"/>
     </div>
     <div >
        <label name="userName">User Name:</label>
        <input name="userName"/>
     </div>
     </form:form>

</body>
</html>

