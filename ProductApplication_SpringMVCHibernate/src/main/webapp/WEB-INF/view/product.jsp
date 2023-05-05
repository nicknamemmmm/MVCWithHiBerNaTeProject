<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<h1>All product Name Here Display Plaese Take one</h1>

<form action="UserSaveInDb" method="post">



<label>UserName</label><br>
<input type="text" name="name"/><br>

<label>User Surname</label><br>
<input type="text" name="surname"/><br>

<label>User Email Id</label><br>
<input type="text" name="email"/><br>

<label>User Password</label><br>
<input type="password" name="password"/><br>

<label>User Phone Number</label><br>
<input type="text" name="phoneNo"/><br>

<input type="submit" value="submitUser"/>
</form>

</body>
</html>