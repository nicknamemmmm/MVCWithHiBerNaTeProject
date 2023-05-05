<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Fill The User Form Data</h1>

<form action="saveuser" method="post"><br>

<label>Name</label>
<input type="text" name="name"/><br>

<label>Email</label>
<input type="text" name="email"/><br>

<label>Password</label>
<input type="text" name="password"/><br>

<label>Phone Number</label>
<input type="text" name="phono"/><br>

<input type="submit" value="SubmitUserForm"/>

</form>

</body>
</html>