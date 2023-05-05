<%@page import="com.soft.entity.ProductName"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Upadete</h1>
<%ProductName existuser=(ProductName)request.getAttribute("User"); %>

<form action="updateproduct" >

<label>UserName</label><br>
<input type="text" name="name" value="<%=existuser.getName() %>"/><br>

<label>User Surname</label><br>
<input type="text" name="surname" value="<%=existuser.getSurname() %>"/><br>

<label>User Email Id</label><br>
<input type="text" name="email" value="<%=existuser.getEmail() %>"/><br>

<label>User Password</label><br>
<input type="password" name="password" value="<%=existuser.getPassword() %>"/><br>

<label>User Phone Number</label><br>
<input type="text" name="phoneNo" value="<%=existuser.getPhoneNo() %>"/><br>

<input type="submit" value="UpdateProduct"/>
</form>

</body>
</html>