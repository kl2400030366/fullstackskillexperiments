
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Students Details</h3>
	<form action="InsertServlet" method="post">
		Student ID: <input type="text" name="T1" /> <br/><br/>
		Student Name: <input type="text" name="T2" /> <br/><br/>
		Student Dept: <input type="text" name="T3" /><br/><br/>
		<input type="submit" value="Save" />
	</form>
</body>
</html>