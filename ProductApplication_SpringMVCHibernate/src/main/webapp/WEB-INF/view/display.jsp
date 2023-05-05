<%@page import="com.soft.entity.ProductName"%>
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
<h1>This is User Display Page</h1>




<table>

<tr>
<th>UserId</th>
<th>Name</th>
<th>Surname</th>
<th>Email</th>
<th>Password</th>
<th>Phone Number</th>
</tr>

<% List<ProductName>  list =(List<ProductName>) request.getAttribute("userlest");%>

<%for(ProductName ProductName:list){ %>
<tr>
<td><%=ProductName.getId() %></td>
<td><%=ProductName.getName() %></td>
<td><%=ProductName.getSurname() %></td>
<td><%=ProductName.getEmail() %></td>
<td><%=ProductName.getPassword() %></td>
<td><%=ProductName.getPhoneNo()%></td>
<td><a href="eexistuser?id=<%=ProductName.getId() %>"><button>Update</button></a><a href="deleteproduct?id<%=ProductName.getId() %>"><button>Delete</button></a></td>
</tr>

<%} %>
</table>









</body>
</html>