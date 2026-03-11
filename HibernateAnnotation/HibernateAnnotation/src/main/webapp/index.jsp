<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>New Staff Insertion</h1>
<form action="InsertStaff" method="post">
		<table>
			<tr>
				<td>Emp Name:</td>
				<td><input type="text" name="T1"/></td>
			</tr>
			<tr>
				<td>Emp Dept:</td>
				<td><input type="text" name="T2"/></td>
			</tr>
			<tr>
				<td>Emp Salary:</td>
				<td><input type="text" name="T3"/></td>
			</tr>
			<tr>
				
				<td><input type="submit" value="Insert"/></td>
			</tr>
		</table>
				
	</form>

</body>
</html>