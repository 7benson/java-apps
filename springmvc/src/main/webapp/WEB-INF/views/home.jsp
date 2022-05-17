<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="java.util.ArrayList"%>
<%@ page import ="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
<h1>
This is a home page
</h1>
<%
	String name=(String)request.getAttribute("name");
	List<String> friends = (List<String>) request.getAttribute("friends");
%>
<h1><%=name %></h1>

<% for(String s : friends){ %>
<h3><%=s %></h3>
<% } %>

</body>
</html>