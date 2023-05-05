<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="saveuserdb" method="post">
<h1>UserForm</h1>
<label>Name</label><br>
<input type="text" name="name"/><br>

<label>Surname</label><br>
<input type="text" name="surname"/><br>

<label>Father Name</label><br>
<input type="text" name="fathername"/><br>

<label>Mother Name</label><br>
<input type="text" name="mothername"/><br>

<label>Brother Name</label><br>
<input type="text" name="brothername"/><br>

<label>How Many Child</label><br>
<input type="text" name="howmanychild"/><br>

<input type="submit" value="SubmitUserForm"/>
</form>
</body>
</html>