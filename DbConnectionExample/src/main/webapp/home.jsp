<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>LOGIN</h2>
<table>
<form name="frm" action="student/insert" method="post">
<tr><td>Enter name:</td><td><input type="text" name="username"></td></tr>
<tr><td>Enter Password:</td><td><input type="password" name="password"></table></td></tr>
<tr><td><input type="submit" name="sub" value="Login"></td></tr>
</table>
</form>
<br>
<a href="allstudent/view">View Students</a>
</body>
</html>