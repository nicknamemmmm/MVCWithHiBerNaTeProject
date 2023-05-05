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

<% User exsitUser = (User) request.getAttribute("ExistUser"); %>

<form action="updateUser" method="post">

	<label>Id</label>
	<input type="text" name="id" value="<%=exsitUser.getId() %>" readonly><br><br>
	
	<label>Name</label>
	<input type="text" name="name" value="<%=exsitUser.getName() %>"><br><br>
	<label>Address</label>
	<input type="text" name="address" value="<%=exsitUser.getAddress() %>"><br><br>
	<label>Phone No</label>
	<input type="text" name="phno" value="<%=exsitUser.getPhno()%>"><br><br>

<input type="submit" value="UpdateUserDetails">
</form>


</body>
</html>