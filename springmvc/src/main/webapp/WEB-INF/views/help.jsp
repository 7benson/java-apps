<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.time.LocalDateTime" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Help page</h1>
<%-- <%
	String name=(String) request.getAttribute("name");
	LocalDateTime now=(LocalDateTime)request.getAttribute("now");
%> --%>
<%-- <h3><%=name %></h3>
<h3><%=now.toString()%></h3>
 --%>
<h3>${name}</h3>
<h3>${now}</h3>

<c:forEach var="item" items="${num}">
<h1>${item}</h1>
</c:forEach> 

</body>
</html>