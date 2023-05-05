<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>User Register Here</h1>
<form action="saveUser" method="post">

<label>UserId</label><br>
<input type="text" name="id"/><br>
<label>UserName</label><br>
<input type="text" name="name"/><br>
<label>UserEmail</label><br>
<input type="text" name="email"/><br>
<label>Password</label><br>
<input type="password" name="password"/><br>
<label>User Address</label><br>
<input type="password" name="address"/><br>
<input type="submit" value="Submit"><br>
</form>
</body>
</html>