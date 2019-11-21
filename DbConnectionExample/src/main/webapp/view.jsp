<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View List</title>
</head>
<body>
	<h2>View students</h2>
	<c:if test="${not empty studentList}">
		<table>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>PAssword</th>
			</tr>
			<c:forEach items="${studentList}" var="student">
				<tr>
					<td>${student.id}</td>
					<td>${student.username}</td>
					<td>${student.password}</td>
				</tr>
			</c:forEach>
		</table>

	</c:if>
</body>
</html>