
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>


    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Customer Name:<c:out value="${n}"></c:out></h1>
<ul>
<li><c:out value="${v}"></c:out></li>
<li><c:out value="${item}"></c:out></li>
<li><c:out value="${money}"></c:out></li>
<li><c:out value="${desc}"></c:out></li>
</ul>
</body>
</html>