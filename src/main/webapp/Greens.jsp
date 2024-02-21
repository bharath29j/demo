<%@page import="com.add.Greens"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Greens Tech OMR</title>
</head>
<body>
	<!--HTML PAGE---->
	<%Greens ab=(Greens)request.getAttribute("encap");%>
	<%=ab.getCourse() %>
	<%=ab.getFees() %>
</body>
</html>