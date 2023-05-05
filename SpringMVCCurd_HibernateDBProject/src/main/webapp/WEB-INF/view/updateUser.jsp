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
<h1>Update User Form</h1>

<% User existUser =(User) request.getAttribute("ExistUser"); %>
<form action="updateUser" method="post">


<label>UserID</label>
<input type="text" name="id" value="<%=existUser.getId()%>" readonly="readonly"/><br>



<label>Name</label>
<input type="text" name="name" value="<%=existUser.getName()%>"/><br>

<label>Email</label>
<input type="text" name="email"value="<%=existUser.getEmail()%>"/><br>

<label>Password</label>
<input type="text" name="password" value="<%=existUser.getPassword()%>"/><br>

<label>Phone Number</label>
<input type="text" name="phono" value="<%=existUser.getPhono()%>"/><br>

<input type="submit" value="updateUserDetails"/>






</form>
</body>
</html>