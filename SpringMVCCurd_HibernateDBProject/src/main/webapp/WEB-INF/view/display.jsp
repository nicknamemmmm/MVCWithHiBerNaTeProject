<%@page import="com.soft.entity.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Display Page</h1>


<table style="border: 2px solid black;">

<tr>
<th>UserId</th>
<th>UserName</th>
<th>UserEmail</th>
<th>Password</th>
<th>UserPhNo</th>
<th>Options</th>
</tr>
<% List<User> list = (List<User>) request.getAttribute("userList"); %>

<% for(User user:list){%>
<tr>
	<td><%=user.getId() %></td>
	<td><%=user.getName() %></td>
	<td><%=user.getEmail() %></td>
	<td><%=user.getPassword() %></td>
	<td><%=user.getPhono() %></td>
	
	<td><a href="updateUserForm?id=<%=user.getId() %>"><button>Update</button></a><a href="deleteById?id=<%=user.getId() %>"><button>Delete</button></a></td>
</tr>

<%} %>
</table>


</body>
</html>