<%@page import="java.util.List"%>
<%@page import="com.soft.entity.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>

<h1>User List Display</h1>

<table style="border: 2px solid black;">

<tr>
<th>UserId</th>
<th>UserName</th>
<th>UserAddress</th>
<th>UserPhNo</th>
<th>Options</th>
</tr>
<% List<User> list = (List<User>) request.getAttribute("userList"); %>

<% for(User user:list){%>
<tr>
	<td><%=user.getId() %></td>
	<td><%=user.getName() %></td>
	<td><%=user.getAddress() %></td>
	<td><%=user.getPhno() %></td>
	
	<td><a href="updateUserForm?id=<%=user.getId() %>"><button>Update</button></a><a href="deleteById?id=<%=user.getId() %>"><button>Delete</button></a></td>
</tr>

<%} %>
</table>

</body>
</html>